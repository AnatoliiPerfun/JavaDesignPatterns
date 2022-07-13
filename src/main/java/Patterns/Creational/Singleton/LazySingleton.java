package Patterns.Creational.Singleton;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 4:41 PM
 */
public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
/*
The above implementation works fine in case of the single-threaded environment but when it comes to multithreaded systems,
it can cause issues if multiple threads are inside the if condition at the same time.
It will destroy the singleton pattern, and both threads will get the different instances of the singleton class.
 */