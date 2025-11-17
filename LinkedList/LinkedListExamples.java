
/**
 * LinkedList in Java: implements the List and Deque interfaces, is a doubly linked list
 * can be found in the java.util package.
 */


import java.util.LinkedList;


class LinkedListExamples{
    public static void main(String[] args) {
       LinkedList<String> fruits = new LinkedList<>();
       fruits.add("Apple");
       fruits.add("Banana");
       fruits.add("Orange");

       System.out.println("Fruits: " + fruits);

    }
}