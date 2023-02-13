package com.minilib.springbootlibrary.services;

import com.minilib.springbootlibrary.entity.Book;
import com.minilib.springbootlibrary.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class BookServices {
    private final BookRepository bookRepository;

    public Iterable<Book> readBooks() {
        return bookRepository.findAll();
    }
}
