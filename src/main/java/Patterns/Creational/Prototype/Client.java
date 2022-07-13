package Patterns.Creational.Prototype;

import static java.lang.System.*;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 12:41 PM
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        out.println("Prototype pattern");
        out.println("------------------------\n");
        RegularCar tesla = new Tesla("Tesla model X");
        out.println(tesla);
        out.println("------------------------\n");
        RegularCar clonedCar;
        clonedCar = tesla.clone();
        printCarDetail(clonedCar);
        out.println("------------------------\n");
        RegularCar ford = new Ford("Ford escape");
        out.println(ford);
        out.println("------------------------\n");
        clonedCar = ford.clone();
        printCarDetail(clonedCar);
    }

    private static void printCarDetail(RegularCar car) {
        out.println("cloned mode: ");
        out.println("model: " + car.modelName);
        car.tearAndWear -= 100;
        out.println("its tearAndWear price: $" + car.tearAndWear);
    }
}
