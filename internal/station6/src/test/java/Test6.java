import org.junit.Test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static org.junit.Assert.*;

public class Test6 {

    @Test
    public void Userクラスに正しくequalsが実装されている() {
        User user = createUser(1, "1", "1@example.com");
        assertEquals(user, createUser(1, "1", "1@example.com"));

        assertNotEquals(user, createUser(1, "1", "2@example.com"));
        assertNotEquals(user, createUser(1, "2", "1@example.com"));
        assertNotEquals(user, createUser(2, "1", "1@example.com"));
    }

    @Test
    public void Userクラスに正しくhashCodeが実装されている() {
        int possible1 = Objects.hash(1, "1", "1@example.com");
        int possible2 = Objects.hash(1, "1@example.com", "1");
        int possible3 = Objects.hash("1", 1, "1@example.com");
        int possible4 = Objects.hash("1", "1@example.com", 1);
        int possible5 = Objects.hash("1@example.com", 1, "1");
        int possible6 = Objects.hash("1@example.com", "1", 1);
        Set<Integer> possibleHashCodes = new HashSet<>();
        possibleHashCodes.add(possible1);
        possibleHashCodes.add(possible2);
        possibleHashCodes.add(possible3);
        possibleHashCodes.add(possible4);
        possibleHashCodes.add(possible5);
        possibleHashCodes.add(possible6);

        assertTrue(possibleHashCodes.contains(createUser(1, "1", "1@example.com").hashCode()));
    }

    private User createUser(int id, String name, String email) {
        User user = new User();
        user.id = id;
        user.name = name;
        user.email = email;
        return user;
    }
}
