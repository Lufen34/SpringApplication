package com.springapp.SpringApplication.repository;

import com.springapp.SpringApplication.library.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
