package dev.whyneet.loop.database.repository;

import dev.whyneet.loop.database.model.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AddressRepository extends CrudRepository<Address, UUID> {
}
