package dev.whyneet.loop.database.repository;

import dev.whyneet.loop.database.model.Store;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface StoreRepository extends CrudRepository<Store, UUID> {
}
