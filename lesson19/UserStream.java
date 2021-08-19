package nikitinaalexandra.lesson19;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserStream {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Maria", 19),
                new User("Ivan", 25),
                new User("Anastasia", 22),
                new User("Alexandr", 33),
                new User("Andrey", 45)
        );
        Optional<User> firstUserWithLetterA = users.stream().filter(user->user.getName().startsWith("A")).findFirst();
        System.out.println("First name starts with 'A' letter: " + firstUserWithLetterA.get().getName());
    }
}
