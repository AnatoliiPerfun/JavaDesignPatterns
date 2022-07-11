package SolidPrinciples.DependencyInversion;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/8/2022 - 3:30 PM
 */
public class OracleDatabase implements Database{
    @Override
    public void updateDatabase(String empId) {
        System.out.println(" the id: " + empId + " is updated in the Oracle Database");
    }
}
