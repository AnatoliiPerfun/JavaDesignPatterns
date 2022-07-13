package Patterns.Creational.Prototype;

import java.util.Random;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 12:32 PM
 */
public class Tesla extends RegularCar{
    public Tesla(String modelName) {
        this.modelName = modelName;
        basePrice = 30000;
        tearAndWear = basePrice - (new Random()).nextInt(1000);
    }

    @Override
    public RegularCar clone() throws CloneNotSupportedException {
        return (Tesla) super.clone();
    }

    @Override
    public String toString() {
        return "Model: " + modelName +  "\nPrice: " + tearAndWear;
    }
}
