package lesson17.Set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Pet> set = new HashSet();
        set.add(new Cat("Vasilek"));
        set.add(new Cat("Boris"));
        set.add(new Cat("Murka"));
        set.add(new Dog("Barbos"));
        set.add(new Dog("Bobik"));
        set.add(new Dog("Zvonok"));
        for (Pet item : set){
            System.out.println(item);
        }

    }
}
