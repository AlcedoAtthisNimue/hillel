package nikitinaalexandra.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson7Task2 {
    public static String divisionWord(String word1, String word2){
        return word1.substring(0, word1.length()/2) + word2.substring(word2.length()/2);
    }
    public static boolean checkAmountLetters (String word){
        if (word.length() % 2 != 0 || word.length()==0){
            System.out.println("Вы ввели слово с неверным количеством букв");
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Введите два слова c четным количеством букв или нажмите Enter для завершения программы");
            String word1 = bufferedReader.readLine();
            if (word1.equals("")) {
                break;
            }
            if (checkAmountLetters(word1) == false){
                continue;
            }
            String word2 = bufferedReader.readLine();
            if (checkAmountLetters(word2) == false){
                continue;
            }
            System.out.println(divisionWord(word1, word2));
        }
    }
}
