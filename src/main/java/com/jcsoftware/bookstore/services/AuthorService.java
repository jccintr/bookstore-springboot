package com.jcsoftware.bookstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcsoftware.bookstore.models.Author;
import com.jcsoftware.bookstore.repositories.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;

	public List<Author> findAll() {
		return authorRepository.findAll();
	}

	public Author insert(Author newAuthor) {
		return authorRepository.save(newAuthor);
	}

}
