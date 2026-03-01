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

    private Double price;

    private Integer stock;

}
