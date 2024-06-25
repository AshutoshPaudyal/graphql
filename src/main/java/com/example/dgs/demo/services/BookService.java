package com.example.dgs.demo.services;

import com.example.dgs.demo.entities.Book;

import java.util.List;

public interface BookService {

    Book createBook(Book book);

    List<Book> getAllBooks();

    Book getBookById(int bookId);

    void deleteBookById(Integer bookId);

    Book updateBookById(Book book,Integer bookId);
}
