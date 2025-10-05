package com.example.librarayManagement.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="books")
public class Book implements Comparable<Book>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String authorName;
    private int shelf;

    public Book(){}

    public Book(Long id, String name, String authorName, int shelf) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.shelf = shelf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getShelf() {
        return shelf;
    }

    public void setShelf(int shelf) {
        this.shelf = shelf;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.getShelf()-otherBook.getShelf();
    }
}
