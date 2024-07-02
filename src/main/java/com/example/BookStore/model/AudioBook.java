package com.example.BookStore.model;

public class AudioBook extends Book
{
    public String method()
    {
        System.out.println(
                "This is the method in SubClass implementing method overriding..");
        return "This is AudioBook";
    }
}
