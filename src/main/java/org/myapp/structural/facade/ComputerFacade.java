package org.myapp.structural.facade;

class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        System.out.println("Starting computer...");
        cpu.start();
        memory.load();
        hardDrive.read();
        System.out.println("Computer started");
    }

    public void shutdown() {
        System.out.println("Shutting down computer...");
        cpu.shutdown();
        memory.clear();
        hardDrive.write();
        System.out.println("Computer shut down");
    }
}
