package Patterns.Creational.Factory;

import java.util.ArrayList;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/12/2022 - 3:30 PM
 */
public class Dog implements Animal {

    public Dog(String color, Integer lvlOfHunger) {
        System.out.println("Dog: " + color + " lvlOfHunger: " + lvlOfHunger);
    }

    @Override
    public void displayBehaviors() {
        System.out.println("Dog says: guff guff!");
        System.out.println("Dog likes to play.");
    }
}
