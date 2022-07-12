package Patterns.Creational.Abstract;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/12/2022 - 7:07 PM
 */
public class EnemyGroundForce implements Ground {
    public EnemyGroundForce(String color) {
        System.out.println("we are not soldiers... we just like to kill people who is better than us");
    }

    @Override
    public void standBy() {
        System.out.println("we are scared and want to run away");
    }

    @Override
    public void Attack(Navy navy) {
        System.out.println("oh no we are doomed");
    }

    @Override
    public String toString() {
        return "EnemyGroundForce";
    }
}
