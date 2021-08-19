package nikitinaalexandra.lesson19;

import java.util.Arrays;
import java.util.List;

public class ListOfStrings {
    public static void main(String[] args) {
        List<String> listString = Arrays.asList("asdf", "sdfg", "ahjk", "lkag");
        System.out.println("Strings started with 'a' letter converted to UpperCase:");
        listString.stream().filter((String s)->{return s.charAt(0) == 'a';}).map(String::toUpperCase).forEach(x-> System.out.println(x));
    }
}
