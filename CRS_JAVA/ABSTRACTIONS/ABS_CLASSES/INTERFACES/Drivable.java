package ABSTRACTIONS.ABS_CLASSES.INTERFACES;

interface Drivable { // Interface
    void start();      // Automatically public abstract
    void stop();       // Automatically public abstract
    void accelerate(); // Automatically public abstract
}

class Car implements Drivable {
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating.");
    }
}

class Bicycle implements Drivable {
    @Override
    public void start() {
        System.out.println("Bicycle ready to ride.");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stopped.");
    }

    @Override
    public void accelerate() {
        System.out.println("Bicycle pedaling faster.");
    }
}

