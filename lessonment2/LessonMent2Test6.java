package Lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LessonMent2Test6 {
    // у нас парсится страница, нам нужно узнать дату публикации новости

    public static void main(String[] args) {
        String text = "ЖИЗНЬ\nВ Днепре хотят перекрыть движение транспорта на косе на Красном Камне\nСоздано 03.04.2021\n\n" +
                "В Днепре планируют перекрыть движение по косе в Новокодакском районе города, на жилмассиве Красный Камень. " +
                "Для ограничения движения там хотят установить шлагбаум.\n\nЗапретить собираются движение транспорта на " +
                "рекреационной территории косы в направлении острова Горелого на основании письма инспекции по вопросам " +
                "благоустройства горсовета от 18 марта 2021 года.";
        Pattern pattern = Pattern.compile("(\\d\\d.){2}\\d{4}|(\\d\\d) [А-Яа-я]{3,8} \\d{4}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

