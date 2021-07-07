package nikitinaalexandra.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson7Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberStrings = 10;

        System.out.println("Введите " + numberStrings + " строк");
        String [] strings = new String[numberStrings];
        for (int i = 0; i < numberStrings; i++) {
            strings[i] = bufferedReader.readLine();
        }
        int stringLength = 0;
        for (int i = 0; i < numberStrings; i++) {
            stringLength += strings[i].length();
        }
        double averageSymbol = stringLength/numberStrings;
        System.out.println("Средняя длина строк " + averageSymbol);
        System.out.println("Строки, длина которых меньше средней:");
        for (String s : strings){
            if (averageSymbol > s.length()){
                System.out.println(s);
            }
        }
    }
}
