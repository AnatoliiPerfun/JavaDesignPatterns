package Patterns.Creational.Abstract;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/12/2022 - 6:48 PM
 */
public abstract class MilitaryFactory {

    protected  abstract Navy createNaval(String color, String size);
    protected  abstract Ground createInfantry(String color);
    protected  abstract Air createAirCraft(String color, String size);
}
