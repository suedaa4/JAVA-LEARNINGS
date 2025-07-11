package SETS;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        System.out.println("--- HashSet Example ---");

        // 1. Create a HashSet of Strings
        Set<String> uniqueColors = new HashSet<>();

        // 2. Add elements
        uniqueColors.add("Red");
        uniqueColors.add("Green");
        uniqueColors.add("Blue");
        System.out.println("HashSet after adding Red, Green, Blue: " + uniqueColors);

        // 3. Try to add a duplicate element
        boolean addedDuplicate = uniqueColors.add("Red"); // Returns false because "Red already exists
        System.out.println("Attempt to add 'Red' again. Was it added? " + addedDuplicate);
        System.out.println("HashSet after attemtping to add duplicate 'Red':" + uniqueColors);
        // Output will show 'Red' only once.

        // 4. Add more elements
        uniqueColors.add("Yellow");
        uniqueColors.add("Purple");
        System.out.println("HashSet after adding Yellow, Purple: " + uniqueColors);
        
        // 5. Check if an element exists
        boolean containsGreen = uniqueColors.contains("Green");
        System.out.println("Does HashSet contain 'Green'? " + containsGreen);

        boolean containsOrange = uniqueColors.contains("Orange");
        System.out.println("Does HashSet contain 'Orange'? " + containsOrange);

        // 6. Remove an element
        uniqueColors.remove("Blue");
        System.out.println("HashSet after removing 'Blue': " + uniqueColors);

        // 7. Get the size of the HashSet
        System.out.println("Iterating through HashSet elements (order is random):");

        for (String color : uniqueColors) {
            System.out.println("- " + color);
        }

        // 9. Add null (only once)
        uniqueColors.add(null);
        System.out.println("HashSet after adding null: " + uniqueColors);

        uniqueColors.add(null); // No effect
        System.out.println("HashSet after trying to add null again: " + uniqueColors);

        System.out.println("--- End of HashSet Example ---");
    }

}
