package com.springapp.SpringApplication.library;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String surname;

    @ManyToMany(mappedBy = "author")
    private Set<Book> bookset = new HashSet<Book>();

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Author(String name, String surname, Set<Book> bookset) {
        this.name = name;
        this.surname = surname;
        this.bookset = bookset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<Book> getBookset() {
        return bookset;
    }

    public void setBookset(Set<Book> bookset) {
        this.bookset = bookset;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bookset=" + bookset +
                '}';
    }
}
