package lesson15;

public class Main {
    public static void main(String[] args) {
        Swan swan = new Swan();
        Duckbill duckbill = new Duckbill();
        Martin martin = new Martin();
        RubberDuck rubberDuck = new RubberDuck();
        System.out.println(swan);
        swan.swim();
        swan.fly();
        swan.eat();
        swan.hasBeak();
        System.out.println(duckbill);
        duckbill.swim();
        duckbill.eat();
        duckbill.hasBeak();
        System.out.println(martin);
        martin.fly();
        martin.hasBeak();
        martin.eat();
        System.out.println(rubberDuck);
        System.out.println(rubberDuck.getClassName() + " from " + rubberDuck.getMaterial());
        rubberDuck.hasBeak();
        rubberDuck.swim();


    }
}
