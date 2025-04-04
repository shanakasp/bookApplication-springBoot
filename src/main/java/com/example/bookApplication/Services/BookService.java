package com.example.bookApplication.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookApplication.Entities.Book;
import com.example.bookApplication.Repository.BookRepository;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    
    public Book addBook(Book book) {

      return bookRepository.save(book);
       
    }

    public Book getBookByName(String name) {
       return bookRepository.findBookByTitle(name);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book updateBook(Book book) {
     return bookRepository.save(book);
    }
    
}
