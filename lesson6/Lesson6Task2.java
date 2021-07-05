package nikitinaalexandra.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson6Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Введите числа через пробел или нажмите Enter для завершения программы");
            String s = bufferedReader.readLine();
            if (s.equals("")){
                break;
            }
            String[] strings = s.split(" ");
            Integer[] massiv = new Integer[strings.length];
            for (int i = 0; i < strings.length; i++) {
                massiv[i] = Integer.parseInt(strings[i]);
            }
            int sum = 0;
            int max = 0;
            int min = 0;
            for (int i = 0; i < massiv.length; i++){
                sum += massiv[i];
                if (massiv[i]>massiv[max]){
                    max = i;
                }
                if (massiv[i]<massiv[min]){
                    min = i;
                }
            }
            System.out.println("Сумма всех элементов: " + sum);
            System.out.println("Среднее арифметическое: " + (double)sum/massiv.length);
            System.out.println("Количество элементов между максимальным и минимальным элементом: " + (Math.abs(max-min)-1));
        }
    }
}
