package LISTS;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        System.out.println("--- Demonstrating Arraylist Operations ---");

        // 1. create an ArrayList
        // it hold elements of type String
        List<String> groceries = new ArrayList<>();
        System.out.println("Initial ArrayList: " + groceries + "(Size: " + groceries.size() + ")");

        // 2. add elements to the end of the list
        groceries.add("Milk");
        groceries.add("Bread");
        groceries.add("Eggs");
        System.out.println("After adding 3 items: " + groceries);

        // 3. access an element by its index
        String firsItem = groceries.get(0);
        System.out.println("First item (index 0): " + firsItem);

        String secondItem = groceries.get(1);
        System.out.println("Second item (index 1): " + secondItem);

        // 4. add an element at specific index
        // elements from index 1 onward will be shifted to the rigt
        groceries.add(1, "Cheese");
        System.out.println("After adding 'Cheese' at index 1: " + groceries);

        // 5. remove an element by index
        // elements after the removed one will br shifted to the left
        groceries.remove(2); // removes "Bread" (which was at index 2 after "Cheese" was added)
        System.out.println(" After removing item at index 2 (Bread): " + groceries);

        // 6. check if an element exist
        boolean hasMilk = groceries.contains("Milk");
        System.out.println("Does the list contain 'Milk'? " + hasMilk);

        // 7. get the current size of the ArrayList
        System.out.println("Current ArrayList size: " + groceries.size());

        // 8. iterate through the ArrayList
        System.out.println("Iterating through the list:");
        for (String item : groceries) {
            System.out.println("- " + item);
        }
        System.out.println("--- End of ArrayList Example ---");

    }
}