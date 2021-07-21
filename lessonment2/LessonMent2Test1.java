package Lesson15;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LessonMent2Test1 {
    // как проверить емеил на валидность{
    public static void main(String[] args) {
        String text = "a135fjsl@gmail.com";
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        if (matcher.matches()){
            System.out.println("Email valid");
        }else{
            System.out.println("Email is not valid");
        }
       //return matcher.find();


    }
}
