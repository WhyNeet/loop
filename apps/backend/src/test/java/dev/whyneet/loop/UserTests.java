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

import java.util.Optional;
import java.util.Set;

@DataJpaTest
@ActiveProfiles("test")
public class UserTests {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AddressRepository addressRepository;

    private User makeTestUser() {
        return new User("whyneet", "12345", "whyneet@example.org", "Why", "Neet", null, null);
    }

    private Address makeTestAddress() {
        return new Address("Some first line", null, "City", "Country");
    }

    @Test
    public void canCreateUserWithAddresses() {
        Address address = makeTestAddress();

        User user = makeTestUser();
        user.setAddresses(Set.of(address));

        userRepository.save(user);
        addressRepository.save(address);

        Assertions.assertNotNull(user.getId());
        Assertions.assertNotNull(address.getId());
    }

    @Test
    public void canAccessAddressThroughRelation() {
        Address address = makeTestAddress();

        User user = makeTestUser();
        user.setAddresses(Set.of(address));

        userRepository.save(user);
        addressRepository.save(address);

        Optional<User> optionalFetchedUser = userRepository.findById(user.getId());

        Assertions.assertTrue(optionalFetchedUser.isPresent());

        User fetchedUser = optionalFetchedUser.get();

        Assertions.assertEquals(fetchedUser.getAddresses(), Set.of(address));
    }
}
