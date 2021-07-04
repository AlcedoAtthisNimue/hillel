package nikitinaalexandra.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson6Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int var = 6;

        while (true) {
            System.out.println("Введите номер билета (шесть цифр)");
            String s = bufferedReader.readLine();
            String [] strings = s.split("");
            if (strings.length != var) {
                System.out.println("Неправильное количество цифр в номере билета");
                continue;
            }
            Integer[] happyTicket = new Integer[var];
            for (int i = 0; i < strings.length; i++) {
                happyTicket[i] = Integer.parseInt(strings[i]);
            }
            if (happyTicket[0] + happyTicket[1] + happyTicket[2] == happyTicket[3] + happyTicket[4] + happyTicket[5]) {
                System.out.println("Билет счастливый: true");
            }else{
                System.out.println("Билет несчастливый");
            }
        }
    }
}
