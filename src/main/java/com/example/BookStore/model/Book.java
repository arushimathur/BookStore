package com.example.BookStore.model;

import lombok.*;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer bookInteger;
    private String bookName;
    private String author;
    private Integer price;
    private Integer ISBN;
    private Integer discountRate;

    @Enumerated(EnumType.STRING)
    @Column(name = "generesTypes")
    private Generes generes;

    public Object method()
    {
        System.out.println(
                "This is the method in SuperClass implementing method overriding..");
        return new Book();
    }
    public Integer getBookInteger() {
        return bookInteger;
    }

    public void setBookInteger(Integer bookInteger) {
        this.bookInteger = bookInteger;
    }

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
}
