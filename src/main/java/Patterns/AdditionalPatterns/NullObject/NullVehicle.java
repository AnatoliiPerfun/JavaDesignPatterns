package Patterns.AdditionalPatterns.NullObject;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 8:23 PM
 */
public class NullVehicle implements Vehicle {
    // Early initialization
    private static final NullVehicle instance = new NullVehicle();
    public static int nullVehicleCount;
    // The constructor is private to prevent the use of "new"
    private NullVehicle() {
        nullVehicleCount++;
        System.out.print("A null vehicle object is created.");
    }
    // Global point of access
    public static NullVehicle getInstance() {
        return instance;
    }
    @Override
    public void travel() {
        // Do nothing
    }
}
