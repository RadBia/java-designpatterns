package org.myapp.creational.builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .withCPU("Intel i9")
                .withRAM("64GB")
                .withStorage("2TB SSD")
                .withGraphicsCard("NVIDIA RTX 4080")
                .build();

        // Access computer components
        System.out.println("CPU: " + computer.getCpu());
        System.out.println("RAM: " + computer.getRam());
        System.out.println("Storage: " + computer.getStorage());
        System.out.println("Graphics Card: " + computer.getGraphicsCard());
    }
}
