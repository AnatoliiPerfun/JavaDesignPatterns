package Patterns.Creational.Abstract;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/12/2022 - 7:13 PM
 */
public class FriendlyInfinity implements Ground {
    public FriendlyInfinity(String color) {
        System.out.println("Warriors of the Light!");
    }

    @Override
    public void standBy() {
        System.out.println("lets safe everyone!");
    }

    @Override
    public void Attack(Navy navy) {
        System.out.println("go go go! need to kill Orcs!!");
    }

    @Override
    public String toString() {
        return "FriendlyInfinity";
    }
}
