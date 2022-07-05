package SolidPrinciples.SingleResponsibility;

import java.util.Random;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/5/2022 - 7:59 PM
 */
public class EmpIdGenerator {

    String empId;
    public String generateEmpId(String empFirstName) {
        int random = new Random().nextInt(100);
        empId = empFirstName.charAt(0) + "-" + random;
        return empId;
    }
}
