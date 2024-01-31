package dev.whyneet.loop;

import dev.whyneet.loop.database.model.Address;
import dev.whyneet.loop.database.model.User;
import dev.whyneet.loop.database.repository.AddressRepository;
import dev.whyneet.loop.database.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Set;

@DataJpaTest
@ActiveProfiles("test")
public class UserTests {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AddressRepository addressRepository;

    @Test
    public void canCreateUser() {
        Address address = new Address("Some first line", null, "City", "Country");
        User user = new User("whyneet", "12345", "whyneet@example.org", "Why", "Neet", null, Set.of(address));

        userRepository.save(user);
        addressRepository.save(address);

        Assertions.assertNotNull(user.getId());
        Assertions.assertNotNull(address.getId());
        Assertions.assertEquals(user.getAddresses(), Set.of(address));
    }
}
