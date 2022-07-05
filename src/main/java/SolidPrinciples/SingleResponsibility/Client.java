package SolidPrinciples.SingleResponsibility;

import static java.lang.System.out;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/5/2022 - 7:39 PM
 */
public class Client {
    public static void main(String[] args) {
        out.println("Hello World!");
        Employee John = new Employee("John", "Doe", 8.5);
        showEmpDetails(John);
        out.println("\n*******\n");
        Employee Fiona = new Employee("Fiona", "Shrek", 3.1);
        showEmpDetails(Fiona);
        out.println("\n*******\n");
        Employee Groot = new Employee("Groot", "Wood", 10.4);
        showEmpDetails(Groot);
        out.println("\n*******\n");
        Employee Rocket = new Employee("Rocket", "Launch", 2.2);
        showEmpDetails(Rocket);
    }

    private static void showEmpDetails(Employee emp) {
        emp.displayEmpDetail();
        // generate the ID
        EmpIdGenerator empIdGenerator = new EmpIdGenerator();
        String empId = empIdGenerator.generateEmpId(emp.firstName);
        out.println("employee id: " + empId);
        // check the seniority level
        SeniorityCheck seniorityCheck = new SeniorityCheck();
        out.println(empId + " has a " + seniorityCheck.checkSeniority(emp.expInYears) + " Grade");
    }
}
