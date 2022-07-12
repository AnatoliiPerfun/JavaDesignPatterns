package Patterns.Creational.Factory;


/**
 * @author Tolik
 * @project designPatterns
 * @created 7/12/2022 - 3:30 PM
 */
public class CatFactory extends AnimalFactory {

    @Override
    protected Animal createAnimal(String color, Integer LvlOfHunger) {
        return new Cat(color, LvlOfHunger);
    }
}
