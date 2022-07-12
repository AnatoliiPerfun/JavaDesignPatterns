package Patterns.Creational.Abstract;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/12/2022 - 7:14 PM
 */
public class FriendlyAir implements Air {
    public FriendlyAir(String color, String size) {
        System.out.println("lets destroy these bastards!!! ");
    }

    @Override
    public void departureOne() {
        System.out.println("we are the best! we fight for freedom!");
    }

    @Override
    public String toString() {
        return "FriendlyAir";
    }
}
