package Patterns.Creational.Abstract;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/12/2022 - 7:07 PM
 */
public class EnemyNavy implements Navy {
    public EnemyNavy(String color, String size) {
        System.out.println("we are so stupid");
    }

    @Override
    public void onBoard() {
        System.out.println("where are we ?");
    }

    @Override
    public void launchOne(Air air) {
        System.out.println("we just shoot our own ship");
    }

    @Override
    public String toString() {
        return "EnemyNavy";
    }
}
