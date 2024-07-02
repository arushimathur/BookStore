package com.example.BookStore.DTO;

import com.example.BookStore.model.Generes;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private String bookName;
    private String author;
    private Integer price;
    private Integer ISBN;
    private Integer discountRate;

    @Enumerated(EnumType.STRING)
    @Column(name = "generesTypes")
    private Generes generes;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public Integer getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Integer discountRate) {
        this.discountRate = discountRate;
    }

    public Generes getGeneres() {
        return generes;
    }

    public void setGeneres(Generes generes) {
        this.generes = generes;
    }
}
