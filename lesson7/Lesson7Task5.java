package nikitinaalexandra.lesson7;

public class Lesson7Task5 {
    public static void main(String[] args) {
        String s = "It's the possibility of having a dream come true that makes life interesting.";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        String [] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++){
           arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1) + " ";
        }
        System.out.println(String.join(" ", arr));
    }
}
