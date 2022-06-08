package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Book;
import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
