package Patterns.Creational.Abstract;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/12/2022 - 7:12 PM
 */
public class FriendlyNavy implements Navy {
    public FriendlyNavy(String color, String size) {
        System.out.println("Send those murders to hell!");
    }

    @Override
    public void onBoard() {
        System.out.println("evil will be destroyed!");
    }

    @Override
    public void launchOne(Air air) {
        System.out.println("Enemy Battleship go f*ck yourself!");
    }

    @Override
    public String toString() {
        return "FriendlyNavy";
    }
}
