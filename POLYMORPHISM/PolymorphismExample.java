package POLYMORPHISM;

public class PolymorphismExample {
    public static void main(String[] args) {

        // polymorphism in action
        Animal myDog = new Dog(); // Animal reference, Dog object
        Animal myCat = new Cat(); // Animal reference, Cat object

        myDog.makeSound(); // calls Dog's makeSound()
        myCat.makeSound(); // calls Cat's makeSound()

        // you can also put them in an array
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for (Animal animal : animals) {
            animal.makeSound(); // calls the appropriate makeSound() for each object
        }
    }
}
