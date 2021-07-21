package Lesson15;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LessonMent2Test2 {
    // в блоке текста найти украинские телефонные номера и вывести на экран
        public static void main(String[] args) {
            String text = "Мова значно запозичила синтаксис 0979999999із C і C++. Зокрема, взято за основу об'єктну модель С++, проте " +
                    "її модифіковано. Усунуто можливіс+380660112233ть появи деяких 04439845622 конфліктних ситуацій, що могли виникнути через помилки " +
                    "прогр45654645аміста та полегшено сам процес розробки об'єктно-орієнтованих ";

            Pattern pattern = Pattern.compile("(0|\\+380)\\d{9}");
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }


