package Patterns.Creational.Prototype;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 11:20 AM
 */
abstract class RegularCar implements Cloneable  {
    public String modelName;
    public int basePrice = 0;
    public int tearAndWear = 0;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public RegularCar clone() throws CloneNotSupportedException {
        return (RegularCar) super.clone();
    }
}
