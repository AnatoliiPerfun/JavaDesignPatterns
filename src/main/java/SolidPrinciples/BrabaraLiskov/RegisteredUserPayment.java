package SolidPrinciples.BrabaraLiskov;

import static java.lang.System.out;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/6/2022 - 7:26 PM
 */
public class RegisteredUserPayment implements NewPayment, PreviousPayment {

    String name;
    public RegisteredUserPayment(String name) {
        this.name = name;
    }

    @Override
    public void newPayment() {
        out.print("Processing " + name + "`s current payment request");
    }

    @Override
    public void previousPaymentInfo() {
        out.println("Retrieving " + name + "`s last payment details...");
    }
}
