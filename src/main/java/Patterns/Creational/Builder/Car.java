package Patterns.Creational.Builder;

import static java.lang.System.out;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 2:59 PM
 */
public class Car  extends Vehicle{
    String brandName;
    public Car(String brandName) {
        this.brandName = brandName;
        out.println("\n start to make a " + brandName + " car");
    }

}
