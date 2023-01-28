package com.minilib.springbootlibrary.controller;

import com.minilib.springbootlibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.minilib.springbootlibrary.entity.Book;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/book")
    public Book saveBook(@RequestBody Book book){
        return bookRepository.save(book);
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable("id") String bookId){
        return bookRepository.getBookById(bookId);
    }

    @DeleteMapping("/book/{id}")
    public String deleteBook(@PathVariable("id") String bookId){
        return bookRepository.delete(bookId);
    }

    @PutMapping("/book/{id}")
    public String updateBook(@PathVariable("id") String bookId, @RequestBody Book book){
        return bookRepository.update(bookId, book);
    }
}
