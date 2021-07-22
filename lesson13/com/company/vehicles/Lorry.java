package lesson13.com.company.vehicles;

import lesson13.com.company.details.Engine;
import lesson13.com.company.professions.Driver;

import java.util.Objects;

public class Lorry extends Car {
    private int carryingCapacity;

    public Lorry(String brand, String carClass, int weight, Driver driver, Engine engine) {
        super(brand, carClass, weight, driver, engine);
        this.carryingCapacity = carryingCapacity;//kg
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String toString() {
        return "Lorry{\n" +
                "car=" + super.toString() + ",\n"+
                "carryingCapacity='" + carryingCapacity + " kg'\n"+
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lorry lorry = (Lorry) o;
        return carryingCapacity == lorry.carryingCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carryingCapacity);
    }
}
