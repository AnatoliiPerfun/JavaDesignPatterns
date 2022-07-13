package Patterns.Creational.Singleton;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/13/2022 - 5:08 PM
 */
public class SerializedSingleton implements Serializable {

    @Serial
    private static final long serialVersionUID = -7_604_766_932_017_737_115L;

    // prevent from creating a new instance of the class.
    @Serial
    protected Object readResolve() {
        return getInstance();
    }

    private SerializedSingleton(){}
    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
}
/*
Sometimes in distributed systems, we need to implement a Serializable interface in Singleton class,
so that we can store its state in the file system and retrieve it at a later point of time.
 */