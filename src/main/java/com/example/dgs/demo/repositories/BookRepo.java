package com.example.dgs.demo.repositories;

import com.example.dgs.demo.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepo extends JpaRepository<Book,Integer> {
}
