package SolidPrinciples.InterfaceSegregation;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/8/2022 - 12:57 PM
 */
public class Suv implements Truck, Car{

    @Override
    public void loadCargo() {
        System.out.println("loading cargo...");
    }
    @Override
    public void startDrive() {
        System.out.println("Starting drive");
    }


}
