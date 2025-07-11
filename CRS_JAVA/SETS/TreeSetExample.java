package SETS;

import java.util.TreeSet;
import java.net.SocketTimeoutException;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {
        System.out.println("--- TreeSet Example ---");

        // 1. Create a TreeSet of Integers
        // TreeSet automatically sorts element in their natural order.
        Set<Integer> sortedNumbers = new TreeSet<>();

        // 2. Add elements in a seemingly random order
        sortedNumbers.add(30);
        sortedNumbers.add(10);
        sortedNumbers.add(50);
        sortedNumbers.add(20);
        sortedNumbers.add(40);
        System.out.println("TreeSet after adding numbers: " + sortedNumbers);

        // 3. Try to add a duplicate element
        boolean addedDuplicate = sortedNumbers.add(20); // Return false
        System.out.println("Attempted to add 20 again. Was it added? " + addedDuplicate);
        System.out.println("TreeSet after attempting to add duplicate 20: " + sortedNumbers);

        // 4. Check if any element exists
        boolean contains30 = sortedNumbers.contains(30);
        System.out.println("Does TreeSet contain 30? " + contains30); // true

        // 5. Remove an element
        sortedNumbers.remove(40);
        System.out.println("TreeSet after removing 40: " + sortedNumbers);

        // 6. Get the size of the TreeSet
        System.out.println("Current TreeSet size: " + sortedNumbers.size()); //4

        // 7. Iterate through the TreeSet
        System.out.println("Iterating through TreeSet elements (always sorted):");

        for(Integer number : sortedNumbers) {
            System.out.println("- " + number);
        }

        // 8. Try to add null (will throw NullPointException)
        try {
            sortedNumbers.add(null);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
        System.out.println("TreeSet after attempting to add null: " + sortedNumbers);
        System.out.println("--- End of TreeSet Example ---");

    }

}
