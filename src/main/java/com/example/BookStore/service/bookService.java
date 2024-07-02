package com.example.BookStore.service;

import com.example.BookStore.DTO.BookDTO;
import com.example.BookStore.model.Book;

import java.util.List;

public interface bookService {

    public void setBookInfo(Integer discount , Integer currentPrice, String bookName);

    public void setBookInfo(String bookName,String author);


    public void addBooks(BookDTO bookDTO);

    public List<Book> getBooks(String bookName);

}
