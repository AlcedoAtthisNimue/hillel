package lesson15;

import java.util.Objects;

public class RubberDuck extends Bird implements CanSwim, Material{

RubberDuck(){
    organism = false;
}

    @Override
    public void swim() {
        System.out.println(getClassName() + " swims");
    }

    @Override
    public String getMaterial() {
        return "rubber";
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
