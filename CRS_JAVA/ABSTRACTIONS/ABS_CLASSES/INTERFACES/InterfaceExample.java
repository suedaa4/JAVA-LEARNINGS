package ABSTRACTIONS.ABS_CLASSES.INTERFACES;

public class InterfaceExample {
    public static void main(String[] args) {
        Drivable myCar = new Car();
        Drivable myBicycle = new Bicycle();

        myCar.start();
        myCar.accelerate();
        myCar.stop();

        System.out.println("---");

        myBicycle.start();
        myBicycle.accelerate();
        myBicycle.stop();
    }
}