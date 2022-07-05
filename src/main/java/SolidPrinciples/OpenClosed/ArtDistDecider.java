package SolidPrinciples.OpenClosed;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/5/2022 - 9:12 PM
 */
public class ArtDistDecider implements DistinctionDecider{

    @Override
    public void evaluateDistinction(Student student) {
        if (student.score > 70) {
            System.out.println(student.regNumber+" has received a distinction in arts.");
        }
    }
}
