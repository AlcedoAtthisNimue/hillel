package lesson17.map;

import java.util.HashMap;
import java.util.Map;

public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Leo");
        Cat cat2 = new Cat("Tigr");
        Cat cat3 = new Cat("Mulat");
        Cat cat4 = new Cat("Vazilii");
        Cat cat5 = new Cat("Barsik");
        Cat cat6 = new Cat("Rosa");
        Cat cat7 = new Cat("Semen");
        Cat cat8 = new Cat("Pirat");
        Cat cat9 = new Cat("Barmaley");
        Cat cat10 = new Cat("Murka");

        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put(cat1.getName(), cat1);
        map.put(cat2.getName(), cat2);
        map.put(cat3.getName(), cat3);
        map.put(cat4.getName(), cat4);
        map.put(cat5.getName(), cat5);
        map.put(cat6.getName(), cat6);
        map.put(cat7.getName(), cat7);
        map.put(cat8.getName(), cat8);
        map.put(cat9.getName(), cat9);
        map.put(cat10.getName(), cat10);

        for (Map.Entry<String, Cat> item : map.entrySet()) {
            System.out.println(item.getValue());
        }
    }
}
