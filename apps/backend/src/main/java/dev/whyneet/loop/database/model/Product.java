package dev.whyneet.loop.database.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String description;


    @ManyToOne
    private Store store;
}
