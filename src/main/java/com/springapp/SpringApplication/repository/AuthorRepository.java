package com.springapp.SpringApplication.repository;

import com.springapp.SpringApplication.library.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
    
}
