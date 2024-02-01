package dev.whyneet.loop.database.repository;

import dev.whyneet.loop.database.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProductRepository extends CrudRepository<Product, UUID> {
}
