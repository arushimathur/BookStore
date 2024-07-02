package com.example.BookStore.model;

public class Ebook extends Book
{
    public String method()
    {
        System.out.println(
                "This is the method in SubClass implementing method overriding..");
        return "This is Ebook";
    }
}
