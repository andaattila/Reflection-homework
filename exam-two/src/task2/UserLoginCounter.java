package task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserLoginCounter {

    public static void main(String[] args) {
        List<String> userLogin = Arrays.asList("alice", "bob", "alice", "diana", "bob", "eli");
        int result = uniqueUsers(userLogin);
        System.out.println("Number of unique users: " + result);
    }

    public static int uniqueUsers(List<String> logins) {
        Set<String> uniqueLogins = new HashSet<>(logins);
        return uniqueLogins.size();
    }
}
