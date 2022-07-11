package SolidPrinciples.DependencyInversion;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/8/2022 - 3:26 PM
 */
public class UserInterface {
    Database database;

    public UserInterface(Database database) {
        this.database = database;
    }
    public void saveEmpId(String empId) {
        database.updateDatabase(empId);
    }
}
