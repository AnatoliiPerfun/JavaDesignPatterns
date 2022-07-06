package SolidPrinciples.BrabaraLiskov;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/6/2022 - 7:31 PM
 */
public class PaymentHelper {

    List<NewPayment> newPayments = new ArrayList<>();
    List<PreviousPayment> previousPayments = new ArrayList<>();

    public void addNewPayment(NewPayment newPaymentRequest) {
        newPayments.add(newPaymentRequest);
    }

    public void addPreviousPayment(PreviousPayment previousPayment) {
        previousPayments.add(previousPayment);
    }

    public void processNewPayment() {
        for (NewPayment payment : newPayments) {
            payment.newPayment();
            out.println("\n*******\n");
        }
    }

    public void  showPreviousPayment() {
        for (PreviousPayment payment : previousPayments) {
            payment.previousPaymentInfo();
            out.println("\n*******\n");
        }
    }

}
