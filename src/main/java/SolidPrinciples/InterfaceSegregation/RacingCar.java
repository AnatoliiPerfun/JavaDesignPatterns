package SolidPrinciples.InterfaceSegregation;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/8/2022 - 12:55 PM
 */
public class RacingCar implements Car{

    @Override
    public void startDrive() {
        System.out.println("Starting race...");
    }
}
