package ABSTRACTIONS.ABS_CLASSES;

public class AbstractionExample {
    public static void main(String[] args) {
        //Shape shape = new Shape(); // ERROR! Cannot instantiate an abstract class.
        
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        System.out.println("Circle area: " + circle.calculateArea());
        circle.displayColor();

        System.out.println("Rectangle area: " + rectangle.calculateArea());
        rectangle.displayColor();
    }  
}
