package com.example.bookApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookApplication.Entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

    public Book findBookByTitle(String title);
    // You can add custom query methods here
}
