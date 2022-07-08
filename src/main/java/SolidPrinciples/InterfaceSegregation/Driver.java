package SolidPrinciples.InterfaceSegregation;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/8/2022 - 1:00 PM
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println("Ready for driver");

        Car car = new RacingCar();
        car.startDrive();
        Truck  truck = new Suv();
        truck.loadCargo();
        car = new Suv();
        car.startDrive();
    }
}

