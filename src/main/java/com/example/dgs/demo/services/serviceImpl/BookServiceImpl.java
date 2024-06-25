package com.example.dgs.demo.services.serviceImpl;


import com.example.dgs.demo.entities.Book;
import com.example.dgs.demo.repositories.BookRepo;
import com.example.dgs.demo.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepo bookRepo;

    @PostMapping
    public Book createBook(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public Book getBookById(int bookId) {
        return bookRepo.findById(bookId)
                .orElseThrow(()-> new RuntimeException("Book you are looking for not found in the server"));
    }

    @Override
    public void deleteBookById(Integer bookId) {
        Book book = bookRepo.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book you are looking for not found in the server"));
        bookRepo.delete(book);
    }

    @Override
    public Book updateBookById(Book book, Integer bookId) {
        Book bookUpdate = bookRepo.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book you are looking for not found in the server"));

        bookUpdate.setTitle(book.getTitle());
        bookUpdate.setDesc(book.getDesc());
        bookUpdate.setAuthor(book.getAuthor());
        bookUpdate.setPrice(book.getPrice());
        bookUpdate.setPages(book.getPages());

        return bookRepo.save(bookUpdate);
    }

}
