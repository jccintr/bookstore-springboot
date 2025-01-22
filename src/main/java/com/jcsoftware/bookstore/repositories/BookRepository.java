package com.jcsoftware.bookstore.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcsoftware.bookstore.models.Book;

public interface BookRepository extends JpaRepository<Book,UUID> {

}
