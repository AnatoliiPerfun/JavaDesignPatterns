package Patterns.Behavioral.State;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/25/2022 - 10:42 PM
 */
public class TVOnState implements State{
    @Override
    public void doAction() {
        System.out.println("TV IS ON");
    }
}
