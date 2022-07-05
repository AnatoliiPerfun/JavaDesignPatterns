package SolidPrinciples.OpenClosed;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/5/2022 - 9:11 PM
 */
public class ScienceDistDecider implements DistinctionDecider {

    @Override
    public void evaluateDistinction(Student student) {
        if (student.score > 80) {
            System.out.println(student.regNumber + " has received a distinction in science.");
        }
    }
}
