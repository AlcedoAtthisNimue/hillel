package nikitinaalexandra.lesson7;

public class Lesson7Task1 {
    public static void outputStr(String lastName, int score, String subjectName){
        System.out.println(String.format("Студент %s получил %d по %s", lastName, score, subjectName));
    }
    public static void main(String[] args) {
        outputStr("Иванов", 5, "биологии");
    }
}
