package Patterns.Creational.Builder;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 2:43 PM
 */
public class MotoBuilder  implements Builder{

    Moto moto;
    public MotoBuilder() {
        moto = new Moto("Honda");
    }
    @Override
    public void addBrandName() {
        moto.add("moto brand name: " + moto.brandName);
    }
    @Override
    public void buildBody() {
        moto.add("making moto body...");
    }
    @Override
    public void insertWheels() {
        moto.add("2 wheels added");
    }
    @Override
    public Vehicle getVehicle() {
        return moto;
    }
}
