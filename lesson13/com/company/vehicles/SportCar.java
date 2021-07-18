package lesson13.com.company.vehicles;

import lesson13.com.company.details.Engine;
import lesson13.com.company.professions.Driver;

import java.util.Objects;

public class SportCar extends Car {
    private int topSpeed;//km/h
    public SportCar(String brand, String carClass, int weight, Driver driver, Engine engine) {
        super(brand, carClass, weight, driver, engine);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{\n" +
                "car=" + super.toString() + ",\n"+
                "topSpeed='" + topSpeed + " km/h'\n"+
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportCar sportCar = (SportCar) o;
        return topSpeed == sportCar.topSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), topSpeed);
    }
}
