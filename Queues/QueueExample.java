
/**
 * Queue in Java: A Queue is a collection used to hold multiple elements prior to processing.
 * It follows the First-In-First-Out (FIFO) principle, where elements are added at the end and removed from the front.
 * The Queue interface is part of the java.util package and is implemented by various classes like LinkedList, PriorityQueue, etc.
 * 
 * Common Methods:
 * - enqueue/add: Adds an element to the end of the queue.
 * - dequeue/remove: Removes and returns the element at the front of the queue.
 * - peek: Returns the element at the front without removing it.
 */

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;


class QueueExample {
    public static void main(String[] args) {
        // Example usage of Queue can be added here

        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(25);
        queue.add(10);
        queue.add(20); 
        queue.add(15);
      

        System.out.println(queue);
        System.out.println(queue.peek()); // prints 10

        reverse(queue);
        System.out.println("Reversed Queue: " + queue);

    }

    public static void reverse(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }

        Stack<Integer> stack = new Stack<>();

       while (!queue.isEmpty()) {
            stack.push(queue.peek());
            queue.remove();
        }

        // queue.clear();

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}