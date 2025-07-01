package SUBCLASS;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";  // setting the name
        myDog.eat();  // inherited method from Animal
        myDog.bark();  // method from Dog class
    }
}
