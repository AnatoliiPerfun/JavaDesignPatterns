package SolidPrinciples.DependencyInversion;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/8/2022 - 7:16 PM
 */
public class User {
    public static void main(String[] args) {
        System.out.println("DependencyInversion test");

        //use Oracle
        Database database = new OracleDatabase();
        UserInterface userInterface = new UserInterface(database);
        userInterface.saveEmpId("ORACLE");

        //use MySQL
        database = new MySQLDatabase();
        userInterface = new UserInterface(database);
        userInterface.saveEmpId("MYSQL");

    }



}
