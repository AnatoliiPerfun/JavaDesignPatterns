package Patterns.Creational.Builder;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 3:47 PM
 */
public class MotoDirector extends Director{

    @Override
    public Vehicle instruct(Builder builder) {
        builder.buildBody();
        builder.insertWheels();
        builder.addBrandName();
        return builder.getVehicle();
    }
}
