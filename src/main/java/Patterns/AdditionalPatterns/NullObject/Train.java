package Patterns.AdditionalPatterns.NullObject;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 8:22 PM
 */
public class Train implements Vehicle {
    public static int trainCount = 0;

    public Train() {
        trainCount++;
    }

    @Override
    public void travel() {
        System.out.println("Train travel");
    }
}
