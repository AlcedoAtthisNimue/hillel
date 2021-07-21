package Lesson15;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LessonMent2Test9 {
    //Германия - вторая мировая война - в главном штабе завелись шпионы. Нужно подать руководству отчет с фамилиями кто шпион.
// Условия поиска по окончаниям русская фамилия

        public static void main(String[] args) {
            String string = "Иванов телеграфист  \n"
                    + "Кравцова связист\n"
                    + "Прокопенко управляющий\n"
                    + "Тендельбаум аналитик\n"
                    + "Фишер кладовщик\n"
                    + "Беккер повар\n"
                    + "Шмидт охранник";
            String subst = "шпион";


            String regex = "(?<=(ов|ва|ко) )(([А-Яа-я]+))";
            Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
            Matcher matcher = pattern.matcher(string);


            String result = matcher.replaceAll(subst);

            System.out.println(result);
        }
    }

