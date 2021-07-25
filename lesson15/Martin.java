package lesson15;

public class Martin extends Bird implements CanFly, CanEat{

    @Override
    public void eat() {
        System.out.println(getClassName() + " eats bugs");
    }

    @Override
    public void fly() {
        System.out.println(getClassName() + " flies");
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
