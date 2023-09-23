package org.myapp.singleton;
public class Singleton {
    // Private static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
        // Initialization code, if needed
    }

    // Public method to provide access to the single instance
    public static Singleton getInstance() {
        // Lazy initialization: create the instance if it doesn't exist yet
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Add other methods and properties here as needed

    // Example method
    public void doSomething() {
        System.out.println("Singleton instance is doing something.");
    }
}
