package Patterns.AdditionalPatterns.DAO;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/25/2022 - 4:29 PM
 */
public class Books {
    private int number;
    private String name;

    public Books() {
    }

    public Books(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
