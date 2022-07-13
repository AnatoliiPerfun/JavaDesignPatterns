package Patterns.Creational.Singleton;

import java.lang.reflect.Constructor;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 4:58 PM
 */
public class ReflectionSingleton {
    public static void main(String[] args) {
        EagerSingleton instanceOne = EagerSingleton.getInstance();
        EagerSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        assert instanceTwo != null;
        System.out.println(instanceTwo.hashCode());
    }
}
/*
When you run the above test class,
you will notice that hashCode of both instances is not the same that destroys the singleton pattern.
Reflection is very powerful and used in a lot of frameworks like Spring and Hibernate
 */