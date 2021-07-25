package lesson15;

public class Swan extends Bird implements CanSwim, CanFly, CanEat{


    @Override
    public void eat() {
        System.out.println(getClassName() + " eats grass");
    }

    @Override
    public void fly() {
        System.out.println(getClassName() + " flies");
    }

    @Override
    public void swim() {
        System.out.println(getClassName() + " swims");
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
