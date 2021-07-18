package lesson13.com.company;

import lesson13.com.company.details.Engine;
import lesson13.com.company.professions.Driver;
import lesson13.com.company.vehicles.Lorry;
import lesson13.com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Driver lorryDriver = new Driver("Petrov Petr Petrovich", 50, 30);
        Engine lorryEngine = new Engine("Daimler", 130);
        Driver sportCarDriver = new Driver("Ivanov Ivan Ivanovich", 30, 10);
        Engine sportCarEngine = new Engine("Ferrari", 620);
        Lorry lorry = new Lorry("Mercedes-Benz", "Atego", 8000, lorryDriver, lorryEngine);
        lorry.setCarryingCapacity(20000);
        SportCar sportCar = new SportCar("Ferrari", "SF90", 1500, sportCarDriver, sportCarEngine);
        sportCar.setTopSpeed(350);

        System.out.println(lorry);
        System.out.println(sportCar);
    }
}
