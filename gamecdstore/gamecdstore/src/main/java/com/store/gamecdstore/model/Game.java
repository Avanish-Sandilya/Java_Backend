package com.store.gamecdstore.model;

import jakarta.persistence.*;

@Entity
@Table(name="games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String genre;

    public Game(String title, String genre, Double price, Integer stock) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.stock = stock;
    }

    private Double price;

    private Integer stock;



}
