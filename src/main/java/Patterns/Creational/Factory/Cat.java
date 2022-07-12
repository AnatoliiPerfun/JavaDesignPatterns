package Patterns.Creational.Factory;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/12/2022 - 3:29 PM
 */
public class Cat implements Animal{
    public Cat(String color, Integer lvlOfHunger) {
        System.out.println("Cat: " + color + " lvlOfHunger: " + lvlOfHunger);
    }

    @Override
    public void displayBehaviors() {
        System.out.println("Cat says: moor moor!");
        System.out.println("Cat likes to sleep.");
    }
}
