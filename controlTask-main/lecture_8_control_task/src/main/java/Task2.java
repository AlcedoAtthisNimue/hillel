import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    /**
     * Given an array (arr) as an argument complete the function countSmileys
     * that should return the total number of smiling faces.
     *
     * Rules for a smiling face:
     *
     * Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
     * A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
     * Every smiling face must have a smiling mouth that should be marked with either ) or D
     * No additional characters are allowed except for those mentioned.
     *
     * Valid smiley face examples: :) :D ;-D :~)
     * Invalid smiley faces: ;( :> :} :]
     *
     * Example
     * countSmileys([":)", ";(", ";}", ":-D"]);       // should return 2;
     * countSmileys([";D", ":-(", ":-)", ";~)"]);     // should return 3;
     * countSmileys([";]", ":[", ";*", ":$", ";-D"]); // should return 1;
     * Note
     * In case of an empty array return 0. You will not be tested with invalid input
     * (input will always be an array).
     * Order of the face (eyes, nose, mouth) elements will always be the same.
     */

    //Array task
    public static int countSmileys(String[] arr) {
        // Just Smile :)
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(checkString(arr[i])){
                count++;
            }
        }
        return count;
    }

    public static boolean checkString(String s) {
        String patternSmileys = "[:;][-~]?[)D]";
        Pattern pattern = Pattern.compile(patternSmileys);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    public static void main(String[] args) {
        String[] a = {":)", ":D", ":-}", ":-()"};
        String[] b = {":)", "XD", ":0}", "x:-", "):-", "D:"};
        String[] c = {":)", ":D", "X-}", "xo)", ":X", ":-3", ":3"};
        System.out.println(countSmileys(a));
        System.out.println(countSmileys(b));
        System.out.println(countSmileys(c));
    }
}
