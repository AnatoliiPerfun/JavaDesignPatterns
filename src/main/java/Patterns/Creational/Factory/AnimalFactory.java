package Patterns.Creational.Factory;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/12/2022 - 3:31 PM
 */
abstract class AnimalFactory {
    public void createAndDisplay(String color, Integer LvlOfHunger) {
        Animal animal;
        animal = createAnimal(color, LvlOfHunger);
        animal.displayBehaviors();
    }
    protected abstract Animal createAnimal(String color, Integer LvlOfHunger);

}
