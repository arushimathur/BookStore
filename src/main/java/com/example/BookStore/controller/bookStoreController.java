package com.example.BookStore.controller;


import com.example.BookStore.DTO.BookDTO;
import com.example.BookStore.Exception.BookStoreException;
import com.example.BookStore.model.Book;
import com.example.BookStore.service.bookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value="/api")
public class bookStoreController {

    @Autowired
    private bookServiceImpl bookService;

    @PostMapping(value="/add")
    public ResponseEntity<String> addBooks(@RequestBody BookDTO bookDTO) throws BookStoreException
    {
        bookService.addBooks(bookDTO);
        String successMessage ="API.INSERT_SUCCESS";
        return new ResponseEntity<>(successMessage, HttpStatus.CREATED);

    }

    @GetMapping(value = "/getBooks/{bookName}")
    public ResponseEntity<List<Book>> getAllBooks(@PathVariable String bookName)  throws BookStoreException
    {
        List<Book> books = bookService.getBooks(bookName);
        if(books.isEmpty()==false)
            return new ResponseEntity<>(books,HttpStatus.OK);

        return new ResponseEntity<>(books,HttpStatus.BAD_REQUEST);
    }

    @PutMapping(value = "/update/")
    public ResponseEntity<String> updateBookDetails(@RequestBody BookDTO bookDTO)
    {
        bookService.setBookInfo(bookDTO.getBookName(),bookDTO.getAuthor());
        bookService.setBookInfo(bookDTO.getDiscountRate(),bookDTO.getPrice(),bookDTO.getBookName());
        String successMessage ="API.INSERT_SUCCESS";
        return new ResponseEntity<>(successMessage, HttpStatus.ACCEPTED);
    }

}
