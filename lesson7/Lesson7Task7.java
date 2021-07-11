package lesson7;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_pt_BR;

public class Lesson7Task7 {
    public static void main(String[] args) {
        int numOne = 3;
        int numTwo = 56;

        add(numOne, numTwo);
        subtract(numOne, numTwo);
        multiply(numOne, numTwo);
    }
    public static void add(int a, int b){
        StringBuilder sbPlus = new StringBuilder();
        sbPlus.append(a).append(" + ").append(b).append(" = ").append(a + b);
        System.out.println(sbPlus);
        System.out.println(sbPlus.replace(sbPlus.indexOf("="), sbPlus.indexOf("=") + 1, "равно"));
    }
    public static void subtract(int a, int b){
        StringBuilder sbMinus = new StringBuilder();
        sbMinus.append(a).append(" - ").append(b).append(" = ").append(a - b);
        System.out.println(sbMinus);
        System.out.println(sbMinus.replace(sbMinus.indexOf("="), sbMinus.indexOf("=") + 1, "равно"));
    }
    public static void multiply(int a, int b){
        StringBuilder sbMult = new StringBuilder();
        sbMult.append(a).append(" * ").append(b).append(" = ").append(a * b);
        System.out.println(sbMult);
        System.out.println(sbMult.replace(sbMult.indexOf("="), sbMult.indexOf("=") + 1, "равно"));
    }
}
