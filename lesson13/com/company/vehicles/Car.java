package lesson13.com.company.vehicles;

import lesson13.com.company.details.Engine;
import lesson13.com.company.professions.Driver;

import java.util.Objects;

public class Car {
    private String brand;
    private String carClass;
    private int weight;//kg
    private Driver driver;
    private Engine engine;

    public Car(String brand, String carClass, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{\n" +
                "brand='" + brand + "',\n" +
                "carClass='" + carClass + "',\n" +
                "weight='" + weight + " kg',\n" +
                "engine=" + engine + ",\n" +
                "driver=" + driver + "\n" +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getCarClass() {
        return carClass;
    }

    public double getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return car.weight == weight &&
                brand.equals(car.brand) &&
                carClass.equals(car.carClass) &&
                driver.equals(car.driver) &&
                engine.equals(car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, carClass, weight, driver, engine);
    }
}
