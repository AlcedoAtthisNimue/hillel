package nikitinaalexandra.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lesson6Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Введите числа через пробел");
            String s = bufferedReader.readLine();
            String[] strings = s.split(" ");
            Integer[] massiv = new Integer[strings.length];
            for (int i = 0; i < strings.length; i++) {
                massiv[i] = Integer.parseInt(strings[i]);
            }
            System.out.println("Массив до сортировки " + Arrays.asList(massiv));
            int n = 0;
            for (int j = 0; j < massiv.length-1; j++){
                for (int i =0; i < massiv.length-1-n; i++) {
                    if (massiv[i]<massiv[i+1]) {
                        int k = massiv[i];
                        massiv[i] = massiv[i+1];
                        massiv[i+1] = k;
                    }
                }
                n++;
            }
            System.out.println("Массив после сортировки с помощью цикла for");
            for (int i = 0; i < massiv.length; i++){
                System.out.print(massiv[i] + (massiv.length-1 <= i ? "" : ", "));
            }
            System.out.println();

            System.out.println("Массив после сортировки с помощью цикла foreach");
            for (int j: massiv){
                System.out.println(j);
            }
            System.out.println();

            System.out.println("Массив после сортировки с помощью метода Arrays.asList() \n" + Arrays.asList(massiv));
        }
    }
}
