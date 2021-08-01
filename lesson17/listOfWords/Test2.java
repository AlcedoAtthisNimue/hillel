package lesson17.listOfWords;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("роза");
        list.add("лоза");
        list.add("лира");
        System.out.println(list);

        int s = list.size();

        for (int i = 0; i < s; i++){
            if (list.get(i).contains("р") && list.get(i).contains("л")) {
                continue;
            }
            if(list.get(i).contains("л")){
                list.add(list.get(i));
            }
            if(list.get(i).contains("р")){
                list.remove(i);
                s--;
                i--;
            }
        }
        System.out.println(list);
    }
}
