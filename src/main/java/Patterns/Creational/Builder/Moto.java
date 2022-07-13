package Patterns.Creational.Builder;

import static java.lang.System.out;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 3:42 PM
 */
public class Moto extends Vehicle{
    String brandName;
    public Moto(String brandName) {
        this.brandName = brandName;
        out.println("ready to make " + brandName + " moto");
    }
}
