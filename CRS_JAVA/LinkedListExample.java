package LISTS;

import java.util.LinkedList;
import java.util.List; // Using List interface for good practice

public class LinkedListExample {

    public static void main(String[] args) {

        System.out.println("--- Demonstrating LinkedList Operations ---");

        // 1. Create a LinkedList
        // It holds elements of type Integer.
        List<Integer> numbers = new LinkedList<>();
        System.out.println("Initial LinkedList: " + numbers + " (Size: " + numbers.size() + ")");

        // 2. Add elements to the end of the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("After adding 3 numbers: " + numbers);

        // 3. Add an element to the beginning (very efficient for LinkedList)
        // Note: We cast to LinkedList to use methods specific to LinkedList/Deque.
        ((LinkedList<Integer>) numbers).addFirst(5);
        System.out.println("After adding 5 at the beginning: " + numbers);

        // 4. Add an element at a specific index (efficient if you have the node,
        // otherwise still needs traversal to find the spot)
        numbers.add(2, 25); // Adds 25 between 10 and 20
        System.out.println("After adding 25 at index 2: " + numbers);

        // 5. Access an element by its index (can be slow for LinkedList as it needs
        // traversal)
        Integer thirdElement = numbers.get(2); // This will be 25 now
        System.out.println("Element at index 2: " + thirdElement);

        // 6. Remove an element from the beginning (very efficient for LinkedList)
        ((LinkedList<Integer>) numbers).removeFirst();
        System.out.println("After removing the first element: " + numbers);

        // 7. Remove an element from the end (very efficient for LinkedList)
        ((LinkedList<Integer>) numbers).removeLast();
        System.out.println("After removing the last element: " + numbers);

        // 8. Get the current size of the LinkedList
        System.out.println("Current LinkedList size: " + numbers.size());

        // 9. Iterate through the LinkedList
        System.out.println("Iterating through the list:");
        for (Integer num : numbers) {
            System.out.println("- " + num);
        }

        System.out.println("--- End of LinkedList Example ---");
    }
}