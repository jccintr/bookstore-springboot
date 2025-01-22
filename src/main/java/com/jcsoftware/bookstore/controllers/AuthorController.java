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

import com.jcsoftware.bookstore.models.Author;
import com.jcsoftware.bookstore.services.AuthorService;

@RestController
@RequestMapping(value = "/authors")
public class AuthorController {
	
	@Autowired
	private AuthorService service;

	@GetMapping
	public ResponseEntity<List<Author>> findAll(){
        List<Author> authors = service.findAll();
        return ResponseEntity.ok().body(authors);
	}
	
	@PostMapping
	public ResponseEntity<Author> insert(@RequestBody Author newAuthor){
		newAuthor = service.insert(newAuthor);
		return ResponseEntity.status(HttpStatus.CREATED).body(newAuthor);
	}

}
