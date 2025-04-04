package com.example.bookApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookApplication.Entities.Book;
import com.example.bookApplication.Services.BookService;




@RestController
@RequestMapping("/api/v1")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
       Book savedBook = bookService.addBook(book);
       return ResponseEntity.ok(savedBook);
       
    }
    
    @GetMapping("/getBook/{bookName}")
    public ResponseEntity<Book> getBookByName(@PathVariable("bookName") String name) {
      final Book bookByName = bookService.getBookByName(name);

      return ResponseEntity.ok(bookByName);
    }
    
    @GetMapping("/getAll")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> allBooks = bookService.getAllBooks();
        return ResponseEntity.ok(allBooks);
    }
    
    @PutMapping("/updateBook")
    public ResponseEntity<Book> updateBook(@RequestBody Book book) {
       Book updatedBook = bookService.updateBook(book);
       return ResponseEntity.ok(updatedBook);
       
    }
}
