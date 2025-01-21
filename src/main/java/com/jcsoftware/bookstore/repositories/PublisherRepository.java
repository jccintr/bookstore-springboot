package com.jcsoftware.bookstore.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcsoftware.bookstore.models.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher,UUID> {

}
