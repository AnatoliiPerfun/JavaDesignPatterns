package Patterns.Creational.Builder;

import static java.lang.System.out;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 3:48 PM
 */
public class Client {
    public static void main(String[] args) {
        out.println("\n***Builder pattern***");
        //build car
        Builder builder = new CarBuilder();
        Director director = new CarDirector();
        Vehicle vehicle = director.instruct(builder);
        vehicle.showProduct();
        out.println("\n");
        //build moto
        builder = new MotoBuilder();
        director = new MotoDirector();
        vehicle = director.instruct(builder);
        vehicle.showProduct();
    }
}
