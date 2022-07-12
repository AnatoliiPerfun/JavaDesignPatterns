package Patterns.Creational.Factory;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/12/2022 - 4:00 PM
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("Factory demonstration!");

        AnimalFactory factory;
        factory = new CatFactory();
        factory.createAndDisplay("turtle", 99);
        //
        factory = new DogFactory();
        factory.createAndDisplay("black", 100);
    }
}

