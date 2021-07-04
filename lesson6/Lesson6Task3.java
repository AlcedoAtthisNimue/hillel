package nikitinaalexandra.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson6Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Введите размер массива");
            int size = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Введите числа через Enter");
            Integer[] massiv = new Integer[size];
            for (int i = 0; i < massiv.length; i++) {
                massiv[i] = Integer.parseInt(bufferedReader.readLine());
            }
            int min = 0;
            for (int i = 0; i < massiv.length; i++){
                if(massiv[i]<massiv[min]){
                    min = i;
                }
            }
            System.out.println("Минимальное число: " + massiv[min]);
        }
    }
}
