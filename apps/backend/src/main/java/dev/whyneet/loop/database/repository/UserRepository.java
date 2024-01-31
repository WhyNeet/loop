package dev.whyneet.loop.database.repository;

import dev.whyneet.loop.database.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {
}
