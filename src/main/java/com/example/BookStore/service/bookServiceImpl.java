package com.example.BookStore.service;


import com.example.BookStore.DTO.BookDTO;
import com.example.BookStore.model.Book;
import com.example.BookStore.repository.bookRepository;
import org.hibernate.criterion.NotNullExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Service(value = "bookService")
@Transactional
public class bookServiceImpl implements bookService {
    @Autowired
    private bookRepository bookRepo;

    @Override
    public void setBookInfo(Integer discount, Integer currentPrice, String bookName) {
        int newBookPrice = currentPrice - (currentPrice * (discount / 100));
        Book book = bookRepo.findByName(bookName);
        if (!Objects.isNull(book)) {
            book.setPrice(newBookPrice);
            bookRepo.save(book);
        }
    }

    @Override
    public void setBookInfo(String bookName, String author) {
        Book book = bookRepo.findByName(bookName);
        if (!Objects.isNull(book)) {
            book.setAuthor(author);
            bookRepo.save(book);
        }
    }
    public void addBooks(BookDTO bookDTO) {
        Book book = new Book();
        book.setBookName(bookDTO.getBookName());
        book.setAuthor(bookDTO.getAuthor());
        book.setPrice(bookDTO.getPrice());
        book.setDiscountRate(5);
        bookRepo.save(book);
    }

    public List<Book> getBooks(String bookName) {
        List<Book> books = bookRepo.findAllByName(bookName);
        if(books.size()!=0)
            return books;
        return null;
    }

}

