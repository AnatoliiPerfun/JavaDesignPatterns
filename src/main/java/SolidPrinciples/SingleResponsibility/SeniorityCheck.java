package SolidPrinciples.SingleResponsibility;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/5/2022 - 8:33 PM
 */
public class SeniorityCheck {

    public String checkSeniority(double expInYears) {
        return expInYears > 5 ?"senior":"junior";
    }
}
