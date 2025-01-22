package com.jcsoftware.bookstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcsoftware.bookstore.models.Publisher;
import com.jcsoftware.bookstore.repositories.PublisherRepository;

@Service
public class PublisherService {
	
	@Autowired
	private PublisherRepository publisherRepository;

	public List<Publisher> findAll() {
		return publisherRepository.findAll();
	}

	public Publisher insert(Publisher newPublisher) {
		return publisherRepository.save(newPublisher);
	}

}
