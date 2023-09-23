package org.myapp.builder;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;

    // Private constructor to prevent direct instantiation
    private Computer() {
    }

    // Getter methods for computer components
    public String getCpu() {
        return cpu;
    }
    public String getRam() {
        return ram;
    }
    public String getStorage() {
        return storage;
    }
    public String getGraphicsCard() {
        return graphicsCard;
    }

    // Builder class to build the Computer object
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String graphicsCard;

        public Builder() {
        }
        public Builder withCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder withRAM(String ram) {
            this.ram = ram;
            return this;
        }
        public Builder withStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public Builder withGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }
        public Computer build() {
            Computer computer = new Computer();
            computer.cpu = this.cpu;
            computer.ram = this.ram;
            computer.storage = this.storage;
            computer.graphicsCard = this.graphicsCard;
            return computer;
        }
    }
}
