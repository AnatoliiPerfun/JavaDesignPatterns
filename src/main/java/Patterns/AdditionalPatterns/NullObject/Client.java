package Patterns.AdditionalPatterns.NullObject;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 8:24 PM
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("***The Null Object pattern demonstration.***\n");
        String input = null;
        Vehicle vehicle = null;
        boolean flag = true;
        int totalObjects = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            while (flag) {
                System.out.println("Enter your choice(Type 'b' for Bus, 't' for Train ) ");
                input = scanner.next();
                switch (input.toLowerCase()) {
                    case "b" -> vehicle = new Bus();
                    case "t" -> vehicle = new Train();
                    case "exit" -> {
                        flag = false;
                        System.out.println("Closing the application.");
                    }
                    default -> {
                        System.out.println("Invalid input.");
                        vehicle = NullVehicle.getInstance();
                    }
                }
                // There is no need to do a null check now.
                Objects.requireNonNull(vehicle).travel();
                totalObjects = Bus.busCount +
                                Train.trainCount +
                                NullVehicle.nullVehicleCount;
                System.out.println("Number of objects created:" + totalObjects);
            }
        }
    }
}
