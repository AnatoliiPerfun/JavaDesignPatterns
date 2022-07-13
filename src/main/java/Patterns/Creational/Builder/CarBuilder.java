package Patterns.Creational.Builder;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 2:39 PM
 */
public class CarBuilder implements Builder{

    Car car;
    public CarBuilder() {
        car = new Car("BMW");
    }
    @Override
    public void addBrandName() {
        car.add("car brand name: " + car.brandName);
    }
    @Override
    public void buildBody() {
        car.add("making car body...");
    }
    @Override
    public void insertWheels() {
        car.add(" 4 wheels added");
    }
    @Override
    public Vehicle getVehicle() {
        return car;
    }
}
