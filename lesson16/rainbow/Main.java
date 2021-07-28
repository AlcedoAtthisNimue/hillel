package lesson16.rainbow;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Rainbow color = Rainbow.BLUE;
        System.out.println(Arrays.toString(Rainbow.values()));
        System.out.println(Rainbow.BLUE.ordinal());
    }
}
