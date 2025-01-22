package com.jcsoftware.bookstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcsoftware.bookstore.dtos.NewBookDTO;
import com.jcsoftware.bookstore.models.Book;
import com.jcsoftware.bookstore.services.BookService;

@RestController
@RequestMapping(value = "/books")
public class BookController {

	@Autowired
	private BookService service;
	
	
	@GetMapping
	public ResponseEntity<List<Book>> findAll(){
        List<Book> books = service.findAll();
        return ResponseEntity.ok().body(books);
	}
	
	@PostMapping
	public ResponseEntity<Book> insert(@RequestBody NewBookDTO dto){
		Book newBook = service.insert(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(newBook);
	}
}
