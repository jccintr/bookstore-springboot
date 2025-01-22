package com.jcsoftware.bookstore.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcsoftware.bookstore.dtos.NewBookDTO;
import com.jcsoftware.bookstore.models.Author;
import com.jcsoftware.bookstore.models.Book;
import com.jcsoftware.bookstore.models.Publisher;
import com.jcsoftware.bookstore.repositories.AuthorRepository;
import com.jcsoftware.bookstore.repositories.BookRepository;
import com.jcsoftware.bookstore.repositories.PublisherRepository;


@Service
public class BookService {

	@Autowired
	private BookRepository repository;
	
	@Autowired
	private PublisherRepository publisherRepository;
	
	@Autowired
	private AuthorRepository authorRepository;
	
	public List<Book> findAll() {
		return repository.findAll();
	}
	
	public Book insert(NewBookDTO dto) {
		
		
    	Book newBook = new Book();
    	newBook.setTitle(dto.getTitle());
    	newBook.setDescription(dto.getDescription());
    	newBook.setPublisher(publisherRepository.findById(dto.getPublisherId()).get());
    	
		for(UUID aut: dto.getAuthorIds().stream().collect(Collectors.toSet())) {
			newBook.getAuthors().add(authorRepository.findById(aut).get());
		}
		return repository.save(newBook);
	}
}
