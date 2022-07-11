package SolidPrinciples.DependencyInversion;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/8/2022 - 7:15 PM
 */
public class MySQLDatabase implements Database{
    @Override
    public void updateDatabase(String empId) {
        System.out.println(" the id: " + empId + " is updated in the MySQL Database");
    }
}
