package org.myapp.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println("Espresso cost: $" + espresso.cost());

        Coffee espressoWithMilk = new MilkDecorator(new Espresso());
        System.out.println("Espresso with Milk cost: $" + espressoWithMilk.cost());
        System.out.println("Description: " + espressoWithMilk.getDescription());
    }
}
