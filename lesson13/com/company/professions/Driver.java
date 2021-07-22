package lesson13.com.company.professions;

import lesson13.com.company.Person;

import java.util.Objects;

public class Driver extends Person {
    private int drivingExperience;//years

    public Driver(String fullName, int age, int drivingExperience) {
        super(fullName, age);
        this.drivingExperience = drivingExperience;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Driver driver = (Driver) o;
        return drivingExperience == driver.drivingExperience;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), drivingExperience);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "person=" + super.toString() + ", drivingExperience='" + drivingExperience + " years'" +
                "}";
    }
}
