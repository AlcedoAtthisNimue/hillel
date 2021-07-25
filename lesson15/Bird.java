package lesson15;

public abstract class Bird extends Animal implements HasBeak{

    @Override
    public void hasBeak() {
        System.out.println(getClassName() + " has beak");
    }
}
