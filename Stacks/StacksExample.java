/**
 * Stacks is LIFO data structure (Last In First Out) and extends Vector class.
 * It provides methods to push, pop, peek, search, and check if the stack is empty.
 * It is part of java.util package. 
 */

import java.util.Stack;


public class StacksExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);
        System.out.println(stack.peek()); // prints 30

    }
}