package Patterns.Creational.Abstract;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/12/2022 - 7:08 PM
 */
public class EnemyAirForce implements Air {
    public EnemyAirForce(String color, String size) {
        System.out.println("we are so stupid don`t know how to fly");
    }

    @Override
    public void departureOne() {
        System.out.println("oh no we are bad guys and all going to die!");
    }

    @Override
    public String toString() {
        return "EnemyAirForce";
    }
}
