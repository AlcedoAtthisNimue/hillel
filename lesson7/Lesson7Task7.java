package nikitinaalexandra.lesson7;

public class Lesson7Task7 {
    public static void main(String[] args) {
        int numOne = 3;
        int numTwo = 56;
        StringBuilder sbPlus = new StringBuilder();
        StringBuilder sbMinus = new StringBuilder();
        StringBuilder sbMult = new StringBuilder();
        sbPlus.append(numOne).append(" + ").append(numTwo).append(" = ").append(numOne + numTwo);
        sbMinus.append(numOne).append(" - ").append(numTwo).append(" = ").append(numOne - numTwo);
        sbMult.append(numOne).append(" * ").append(numTwo).append(" = ").append(numOne * numTwo);
        System.out.println(sbPlus);
        System.out.println(sbMinus);
        System.out.println(sbMult);
        System.out.println(sbPlus.replace(sbPlus.indexOf("="), sbPlus.indexOf("=") + 1, "равно"));
        System.out.println(sbMinus.replace(sbMinus.indexOf("="), sbMinus.indexOf("=") + 1, "равно"));
        System.out.println(sbMult.replace(sbMult.indexOf("="), sbMult.indexOf("=") + 1, "равно"));
    }
}
