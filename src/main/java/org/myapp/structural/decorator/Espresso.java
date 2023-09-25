package org.myapp.structural.decorator;

public class Espresso implements Coffee {
    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
