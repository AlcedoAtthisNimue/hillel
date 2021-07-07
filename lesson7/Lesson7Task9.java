package nikitinaalexandra.lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson7Task9 {
    public static void main(String[] args) {
        String stroka = "“Versions: Java 5, Java 6, Java 7, Java 8, Java 12.";
        String patternStroki = "Java\\s+\\d{1,2}";
        Pattern pattern = Pattern.compile(patternStroki);
        Matcher matcher = pattern.matcher(stroka);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
