package Patterns.Creational.Builder;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 2:37 PM
 */
public interface Builder {
    void addBrandName();
    void buildBody();
    void insertWheels();

    Vehicle getVehicle();
}
