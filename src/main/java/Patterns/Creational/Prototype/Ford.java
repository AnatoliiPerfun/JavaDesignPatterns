package Patterns.Creational.Prototype;

import java.util.Random;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 12:39 PM
 */
public class Ford extends RegularCar{
    public Ford(String modelName) {
        this.modelName = modelName;
        basePrice = 20000;
        tearAndWear = basePrice - (new Random()).nextInt(2000);
    }

    @Override
    public RegularCar clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }

    @Override
    public String toString() {
        return "Model: " + modelName +  "\nPrice: " + tearAndWear;
    }
}
