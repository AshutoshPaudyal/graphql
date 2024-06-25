package com.example.dgs.demo.controllers;


import com.example.dgs.demo.entities.Book;
import com.example.dgs.demo.mutations.BookInput;
import com.example.dgs.demo.services.BookService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import lombok.RequiredArgsConstructor;


import java.util.List;

@DgsComponent
@RequiredArgsConstructor
public class BookController{

    private final BookService bookService;

    @DgsMutation
    public Book createBook(@InputArgument BookInput bookInput){

        Book book = new Book();
        book.setTitle(bookInput.getTitle());
        book.setDesc(bookInput.getDesc());
        book.setAuthor(bookInput.getAuthor());
        book.setPrice(bookInput.getPrice());
        book.setPages(bookInput.getPages());

        return bookService.createBook(book);
    }

    @DgsQuery
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @DgsQuery
    public Book getBookById(@InputArgument Integer bookId){
        return bookService.getBookById(bookId);
    }

    @DgsMutation
    public String deleteBookById(@InputArgument Integer bookId){

        bookService.deleteBookById(bookId);

        return "Book with book id: "+bookId+" successfully deleted";
    }

    @DgsMutation
    public Book updateBookById(@InputArgument BookInput bookInput,@InputArgument Integer bookId){
        Book book = new Book();
        book.setTitle(bookInput.getTitle());
        book.setDesc(bookInput.getDesc());
        book.setAuthor(bookInput.getAuthor());
        book.setPrice(bookInput.getPrice());
        book.setPages(bookInput.getPages());

        return bookService.updateBookById(book,bookId);
    }
}

