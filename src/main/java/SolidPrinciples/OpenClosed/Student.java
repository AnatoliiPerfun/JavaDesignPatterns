package SolidPrinciples.OpenClosed;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/5/2022 - 8:57 PM
 */
abstract class Student {
    String name;
    String regNumber;
    double score;
    String department;

    public Student(String name, String regNumber, double score) {
        this.name = name;
        this.regNumber = regNumber;
        this.score = score;
    }

    @Override
    public String toString() {
        return ("Name: " + name +
                "\nReg Number: " + regNumber +
                "\nDept: " + department +
                "\nScore: " + score +
                "\n****");
    }
}
