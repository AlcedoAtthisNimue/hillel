package lesson15;

public class Duckbill extends Mammal implements CanSwim, CanEat, HasBeak{

    @Override
    public void eat() {
        System.out.println(getClassName() + " eats bugs");
    }

    @Override
    public void swim() {
        System.out.println(getClassName() + " swims");
    }

    @Override
    public void hasBeak() {
        System.out.println(getClassName() + " has beak");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
