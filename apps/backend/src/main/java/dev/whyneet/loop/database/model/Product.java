package dev.whyneet.loop.database.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, length = 600)
    private String description;

    @Embedded
    private ProductVariant productVariant;

    @ManyToOne
    private Store store;
}
