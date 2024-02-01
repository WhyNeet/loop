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

    public Product(String name, String description, ProductVariant productVariant, Store store) {
        this.name = name;
        this.description = description;
        this.productVariant = productVariant;
        this.store = store;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductVariant getProductVariant() {
        return productVariant;
    }

    public void setProductVariant(ProductVariant productVariant) {
        this.productVariant = productVariant;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
