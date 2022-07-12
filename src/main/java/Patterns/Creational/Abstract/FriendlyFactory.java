package Patterns.Creational.Abstract;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/12/2022 - 7:11 PM
 */
public class FriendlyFactory extends MilitaryFactory{

    public FriendlyFactory(){
        System.out.println("FriendlyFactory");
    }

    @Override
    protected Navy createNaval(String color, String size) {
        return new FriendlyNavy(color, size);
    }

    @Override
    protected Ground createInfantry(String color) {
        return new FriendlyInfinity(color);
    }

    @Override
    protected Air createAirCraft(String color, String size) {
        return new FriendlyAir(color, size);
    }
}
