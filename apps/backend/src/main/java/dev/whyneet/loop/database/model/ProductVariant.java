package dev.whyneet.loop.database.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProductVariant {
    @Column(name = "variant_name", nullable = false)
    private String variantName;

    @Column(nullable = false)
    private Integer price;
}
