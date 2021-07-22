package Lesson15;

public class LessonMent2Test8 {
    // дана последовательность из фруктов и овощей, нам надо в этой строке заменить все названия товаров стоимостью 25 USD и 3 UAH на авокадо
        public static void main(String[] args) {
            String string = "банан 25 UAH\n"
                    + "ананас 30 UAH\n"
                    + "картошка 25 USD\n"
                    + "дыня 4 USD\n"
                    + "яблоко 3 UAH\n"
                    + "лук 25 USD";

            String result = string.replaceAll("([А-Яа-я]+)(?=( 25 USD| 3 UAH))", "авокадо");
            System.out.println(result);
        }
    }

