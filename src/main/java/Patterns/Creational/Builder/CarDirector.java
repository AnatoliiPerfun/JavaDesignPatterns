package Patterns.Creational.Builder;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 3:45 PM
 */
public class CarDirector extends Director{

    @Override
    public Vehicle instruct(Builder builder) {
        builder.buildBody();
        builder.insertWheels();
        builder.addBrandName();
        return builder.getVehicle();
    }
}
