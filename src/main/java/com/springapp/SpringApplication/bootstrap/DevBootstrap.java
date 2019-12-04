package com.springapp.SpringApplication.bootstrap;

import com.springapp.SpringApplication.library.Author;
import com.springapp.SpringApplication.library.Book;
import com.springapp.SpringApplication.library.Publisher;
import com.springapp.SpringApplication.repository.AuthorRepository;
import com.springapp.SpringApplication.repository.BookRepository;
import com.springapp.SpringApplication.repository.PublisherRepository;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository    authorRepository;
    private BookRepository      bookRepository;
    private PublisherRepository publisherRepository; 

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    public void initData()
    {
        Publisher publisher = new Publisher("Flamarion", "Paris");
        Author jason = new Author("Jason", "Gregory");
        Book gea = new Book("Game Engine Architecture", "978-1138035454", publisher);
        Book test = new Book("Test book", "864484486", publisher);
        jason.getBookset().add(gea);
        jason.getBookset().add(test);
        gea.getAuthorSet().add(jason);
        test.getAuthorSet().add(jason);

        publisherRepository.save(test.getPublisher());
        authorRepository.save(jason);
        bookRepository.save(gea);
        bookRepository.save(test);
        

        Author eric = new Author("Eric", "Freeman");
        Book hfdp = new Book("Head First Design Patterns", "9780596007126", publisher);
        eric.getBookset().add(hfdp);
        hfdp.getAuthorSet().add(eric);

        authorRepository.save(eric);
        bookRepository.save(hfdp);
    }
}
