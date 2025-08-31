package task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class UserLoginCounterTest {
    @Test
    void shouldCalculateNumberOfUsers() {
        List<String> logins = Arrays.asList("bob", "bob", "bob", "jozsi", "bob", "bob");
        int expected = 2;
        Assertions.assertEquals(expected, UserLoginCounter.uniqueUsers(logins));
    }
}
