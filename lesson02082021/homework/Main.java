package nikitinaalexandra.lesson02082021.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        House house1 = new House(100, 120, "Kyiv", false);
        House house2 = new House(20, 600, "Hong Kong", false);
        House house3 = new House(40, 100, "Moscow", false);

        List<House> list = new ArrayList<>();
        list.add(house1);
        list.add(house2);
        list.add(house3);

        System.out.println("Unsorted list:");
        for(House item : list){
            System.out.println(item);
        }
        System.out.println("Sorted by price:");
        Collections.sort(list);
        for(House item : list){
            System.out.println(item);
        }
        System.out.println("Sorted by area:");
        Collections.sort(list, new HouseComparator());
        for(House item : list){
            System.out.println(item);
        }
    }
}
