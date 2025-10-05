package com.example.librarayManagement.DTO;

import org.antlr.v4.runtime.misc.NotNull;

public class BookResponse {

    private Long id;
    private String name;
    private String authorName;
    private int shelf;

    public BookResponse(Long id, String name, String authorName, int shelf) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.shelf = shelf;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getShelf() {
        return shelf;
    }
}
