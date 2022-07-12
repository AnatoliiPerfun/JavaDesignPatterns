package Patterns.Creational.Abstract;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/12/2022 - 7:17 PM
 */
public class BattleField {
    public static void main(String[] args) {
        System.out.println("Battle Field Abstract Factory ***\n");
        MilitaryFactory militaryFactory;
        //
        militaryFactory = new EnemyFactory();
        Air air = militaryFactory.createAirCraft("Red", "small");
        Navy navy = militaryFactory.createNaval("Red", "small");
        Ground ground = militaryFactory.createInfantry("Red");
        air.departureOne();
        ground.Attack(navy);
        navy.launchOne(air);

        System.out.println("\n*****\n");

        militaryFactory = new FriendlyFactory();
        air = militaryFactory.createAirCraft("White", "Big");
        navy = militaryFactory.createNaval("Blue", "Big");
        ground = militaryFactory.createInfantry("Green");
        air.departureOne();
        navy.launchOne(air);
        ground.Attack(navy);
    }
}
