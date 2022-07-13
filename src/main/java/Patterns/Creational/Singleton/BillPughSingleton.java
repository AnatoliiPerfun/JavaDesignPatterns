package Patterns.Creational.Singleton;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 4:47 PM
 */
public class BillPughSingleton {
    private BillPughSingleton(){}
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
/*
Notice the private inner static class that contains the instance of the singleton class.
When the singleton class is loaded,
SingletonHelper class is not loaded into memory, and only when someone calls the getInstance method,
this class gets loaded and creates the Singleton class instance.
 */