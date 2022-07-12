package Patterns.Creational.Abstract;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/12/2022 - 7:05 PM
 */
public class EnemyFactory extends MilitaryFactory{

    public EnemyFactory() {
        System.out.println("EnemyFactory");
    }

    @Override
    protected Navy createNaval(String color, String size) {
        return new EnemyNavy(color, size);
    }

    @Override
    protected Ground createInfantry(String color) {
        return new EnemyGroundForce(color);
    }

    @Override
    protected Air createAirCraft(String color, String size) {
        return new EnemyAirForce(color, size);
    }
}
