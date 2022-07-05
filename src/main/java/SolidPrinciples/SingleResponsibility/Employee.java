package SolidPrinciples.SingleResponsibility;

import java.util.Random;

import static java.lang.System.out;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/5/2022 - 5:12 PM
 */

class Employee {
    public String firstName, lastName, empId;
    public double expInYears;

    public Employee(String firstName, String lastName, double expInYears) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expInYears = expInYears;
    }

    public void displayEmpDetail() {
        out.println("employee name: " + firstName + ", last name: " + lastName);
        out.println("employee has" + expInYears + " years of experience");
    }

}
