package Lesson15;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LessonMent2Test3 {
    // в блоке текста найти все номера кредитных карт

        public static void main(String[] args) {
            String text = "Мова значно за 4441-3333-4444-5555 позичила синтаксис 09 79999999із C і C++. Зокрема, взято за основу об'єктну модель С++, проте " +
                    "її 5375 2222 3333 4444модифіковано. 334 ть появи деяких конфліктних 5375222233334444 ситуацій, що могли виникнути через помилки ";

            Pattern pattern = Pattern.compile("(\\d{4}[ -]?){4}");
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }


