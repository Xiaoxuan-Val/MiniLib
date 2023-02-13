package com.minilib.springbootlibrary.controller;

import com.minilib.springbootlibrary.services.BookServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/library")
@RequiredArgsConstructor
public class BookController {
    private final BookServices bookServices;
    @GetMapping("/book")
    public ResponseEntity readBooks() {
        return ResponseEntity.ok(bookServices.readBooks());
    }

}
