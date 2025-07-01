
package SUBCLASS;

// superclass
class Animal { 
    String name;
  void eat(){
    System.out.println(name + " is eating.");
  }
   
}

// subclass
class Dog extends Animal {
    void bark() {
        System.out.println(name + " says woof!");
    }
}