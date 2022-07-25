package Patterns.AdditionalPatterns.NullObject;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 8:21 PM
 */
public class Bus implements Vehicle {
    public static int busCount = 0;

    public Bus() {
        busCount++;
    }

    @Override
    public void travel() {
        System.out.println("Bus travel");
    }
}
