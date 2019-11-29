package com.springapp.SpringApplication.repository;

import com.springapp.SpringApplication.library.Publisher;

import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{
    
}