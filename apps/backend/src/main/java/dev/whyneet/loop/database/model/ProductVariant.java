package dev.whyneet.loop.database.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProductVariant {
    @Column(name = "variant_name", nullable = false)
    private String variantName;

    @Column(nullable = false)
    private Double price;

    public ProductVariant() {
    }

    public ProductVariant(String variantName, Double price) {
        this.variantName = variantName;
        this.price = price;
    }

    public String getVariantName() {
        return variantName;
    }

    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
