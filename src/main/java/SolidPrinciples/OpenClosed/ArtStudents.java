package SolidPrinciples.OpenClosed;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/5/2022 - 9:02 PM
 */
public class ArtStudents extends Student{

    public ArtStudents (String name, String regNumber, double score, String dept) {
        super(name, regNumber, score);
        this.department = dept;
    }
}
