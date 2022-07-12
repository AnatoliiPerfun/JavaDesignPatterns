package Patterns.Creational.Factory;


/**
 * @author Tolik
 * @project designPatterns
 * @created 7/12/2022 - 3:51 PM
 */
public class DogFactory extends AnimalFactory {

    @Override
    protected Animal createAnimal(String color, Integer LvlOfHunger) {
        return new Dog(color, LvlOfHunger);
    }
}
