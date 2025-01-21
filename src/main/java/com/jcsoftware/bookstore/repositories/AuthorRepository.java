package com.jcsoftware.bookstore.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcsoftware.bookstore.models.Author;

public interface AuthorRepository extends JpaRepository<Author,UUID> {

}
