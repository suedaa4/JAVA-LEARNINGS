package QUEUES;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueueExample {
    public static void main(String[] args) {
        System.out.println("--- LinkedList as Queue Example (FIFO) ---");

        // 1. Create a Queue using LinkedList
        // This queue will process tasks in the order they arrive.
        Queue<String> taskQueue = new LinkedList<>();

        // 2. Add elements to the queue (offer() is generally preferred over add() for
        // queues)
        // offer() adds to the end of the queue.
        taskQueue.offer("Task A"); // First in
        taskQueue.offer("Task  B");
        taskQueue.offer("Task C"); // last in

        System.out.println("Queue after adding tasks: " + taskQueue);

        // 3. Peek at the head of the queue
        // peek() returns null if the queue is empty. element() throws NoSuchException
        String nextTask = taskQueue.peek();
        System.out.println("Next task to be processed (peek): " + nextTask);
        System.out.println("Queue after peek: " + taskQueue);

        // 4. Remove elements from the queue (poll() is generally preferred over
        // remove())
        // poll() removes from the head of the queue.
        String processedTask1 = taskQueue.poll();
        System.out.println("Processed task 1 (poll): " + processedTask1);
        System.out.println("Queue after processing Task A: " + taskQueue);

        // It processes "Task B" next.
        String processedTask2 = taskQueue.poll();
        System.out.println("Processed task 2 (poll): " + processedTask2);
        System.out.println("Queue after processing Task B: " + taskQueue);

        // 5. Check if the queue is empty
        System.out.println("Is queue empty? " + taskQueue.isEmpty());

        // 6. Add another task and process the last one
        taskQueue.offer("Task D");
        System.out.println("Queue after adding Task D: " + taskQueue);

        String processedTask3 = taskQueue.poll();
        System.out.println("Processed task 3 (poll): " + processedTask3);
        System.out.println("Queue after processing Task C: " + taskQueue);

        String processedTask4 = taskQueue.poll();
        System.out.println("Processed task 4 (poll): " + processedTask4);
        System.out.println("Queue after processing Task D: " + taskQueue);

        System.out.println("Is queue empty? " + taskQueue.isEmpty());

        // 7. Attempt to poll from an empty queue
        String result = taskQueue.poll();
        System.out.println("Polling from empty queue: " + result);

        System.out.println("--- En of LinkedList as Queue Example ---");

    }

}
