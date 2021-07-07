package nikitinaalexandra.lesson7;

public class Lesson7Task3 {
    public static void calc(String s){
        String [] arr =  s.split(" ");
        int i1 = Integer.parseInt(arr[0]);
        int i2 = Integer.parseInt(arr[2]);
        int i = 0;
        if (arr[1].equals("plus")){
             i = i1 + i2;
        }
        if (arr[1].equals("minus")){
             i = i1 - i2;
        }
        System.out.println(s + " = " + i);
    }
    public static void main(String[] args) {
        String s1 = "1 plus 5";
        String s2 = "6 minus 5";
        String s3 = "8 plus 10";
        String s4 = "16 minus 5";
        calc(s1);
        calc(s2);
        calc(s3);
        calc(s4);
    }
}
