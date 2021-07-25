package lesson15;

import java.util.Objects;

public abstract class Animal {
    public boolean organism = true;

    public String getClassName(){
        String[] arr = String.valueOf(getClass()).split("\\.");
        return arr[arr.length-1];
    }

    public boolean isOrganism() {
        return this.organism;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return organism == animal.organism;
    }

    @Override
    public int hashCode() {
        return Objects.hash(organism);
    }

    @Override
    public String toString() {
        return getClassName() + "{" +
                "organism=" + isOrganism() +
                '}';
    }
}
