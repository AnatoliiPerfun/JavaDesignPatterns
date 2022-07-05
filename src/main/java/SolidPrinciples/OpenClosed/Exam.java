package SolidPrinciples.OpenClosed;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/5/2022 - 9:08 PM
 */
public class Exam {
    public static void main(String[] args) {

        List<Student> scienceStudents = enrollScienceStudents();
        List<Student> artStudents = enrollArtStudents();
        // Display all results
        System.out.println("Results: ");
        for (Student student : scienceStudents) {
            System.out.println(student);
        }
        for (Student student : artStudents) {
            System.out.println(student);
        }
        // Evaluate distinctions
        DistinctionDecider scienceDistDecider =
                new ScienceDistDecider();
        DistinctionDecider artDistDecider =
                new ArtDistDecider();
        System.out.println("Distinctions: ");
        for (Student student : scienceStudents) {
            scienceDistDecider.evaluateDistinction(student);
        }
        for (Student student : artStudents) {
            artDistDecider.evaluateDistinction(student);
        }
    }

    private static List<Student> enrollScienceStudents() {
        Student sam = new ScienceStudents("Sam","R1",81.5,"Comp.Sc.");
        Student bob = new ScienceStudents("Bob","R2",72,"Physics");
        List<Student> scienceStudents = new ArrayList<>();
        scienceStudents.add(sam);
        scienceStudents.add(bob);
        return scienceStudents;
    }
    private static List<Student> enrollArtStudents() {
        Student john = new ArtStudents("John", "R3", 71,"History");
        Student kate = new ArtStudents("Kate", "R4", 66.5,"English");
        List<Student> artStudents = new ArrayList<>();
        artStudents.add(john);
        artStudents.add(kate);
        return artStudents;
    }
}
