package nikitinaalexandra.lesson19;

import java.util.Arrays;
import java.util.List;

public class ListOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Entered numbers: " + list);

        long count = list.stream().filter((Integer x)->{return x%2 == 0;}).count();
        System.out.println("Sum of even numbers = " + count);
    }
}
