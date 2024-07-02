package com.example.BookStore.repository;

import com.example.BookStore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface bookRepository extends JpaRepository<Book, Long> {

    Book findByName(@Param("bookName") String name);

    List<Book> findAllByName(String bookName);
}
