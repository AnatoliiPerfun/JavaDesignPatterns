package Patterns.Creational.Singleton;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 4:18 PM
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    //private constructor to avoid client applications to use constructor
    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }
}
/*
If your singleton class is not using a lot of resources, this is the approach to use.
But in most of the scenarios, Singleton classes are created for resources such as File System, Database connections, etc.
We should avoid the instantiation until unless client calls the getInstance method.
Also, this method doesn’t provide any options for exception handling.
 */