package Patterns.Creational.Singleton;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 4:35 PM
 */
public class StaticBlockSingleton {
    private static final StaticBlockSingleton instance;
    private StaticBlockSingleton(){}

    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
/*
Static block initialization implementation is similar to eager initialization,
except that instance of class is created in the static block that provides an option for exception handling.
 */