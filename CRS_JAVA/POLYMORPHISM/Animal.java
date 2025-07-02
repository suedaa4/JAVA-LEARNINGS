package POLYMORPHISM;

// parent class
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// child class
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }
}

// child class
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow meow!");
    }
}
