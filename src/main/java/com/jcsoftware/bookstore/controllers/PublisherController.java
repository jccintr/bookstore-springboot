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

import com.jcsoftware.bookstore.models.Publisher;
import com.jcsoftware.bookstore.services.PublisherService;

@RestController
@RequestMapping(value = "/publishers")
public class PublisherController {
	
	@Autowired
	private PublisherService service;

	@GetMapping
	public ResponseEntity<List<Publisher>> findAll(){
        List<Publisher> publishers = service.findAll();
        return ResponseEntity.ok().body(publishers);
	}
	
	@PostMapping
	public ResponseEntity<Publisher> insert(@RequestBody Publisher newPublisher){
		newPublisher = service.insert(newPublisher);
		return ResponseEntity.status(HttpStatus.CREATED).body(newPublisher);
	}

}
