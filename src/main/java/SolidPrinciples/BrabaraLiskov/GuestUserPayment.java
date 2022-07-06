package SolidPrinciples.BrabaraLiskov;

import static java.lang.System.out;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/6/2022 - 7:30 PM
 */
public class GuestUserPayment implements NewPayment{

    String name;

    public GuestUserPayment() {
        this.name = "guest";
    }

    @Override
    public void newPayment() {
        out.println("Processing " + name + "`s payment request...");
    }
}
