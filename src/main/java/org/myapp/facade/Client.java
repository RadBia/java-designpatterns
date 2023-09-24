package org.myapp.facade;

public class Client {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();

        // Start the computer
        computer.start();

        // Perform operations
        // ...

        // Shut down the computer
        computer.shutdown();
    }
}
