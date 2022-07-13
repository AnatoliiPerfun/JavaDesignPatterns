package Patterns.Creational.Builder;

import java.util.LinkedList;

import static java.lang.System.out;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 2:38 PM
 */
abstract class Vehicle {

    private final LinkedList<String> parts;

    public Vehicle() {
        parts = new LinkedList<String>();
    }

    public void add(String part) {
        parts.addLast(part);
    }

    public void showProduct() {
        out.println("Construction sequence:");
        parts.stream().map(part -> " " + part).forEach(out::println);
    }
}
