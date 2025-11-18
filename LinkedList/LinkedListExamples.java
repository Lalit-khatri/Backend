
/**
 * LinkedList in Java: implements the List and Deque interfaces, is a doubly linked list
 * can be found in the java.util package.
 * 
 * Vector class.
 * Vector is similar to ArrayList but is synchronized (thread-safe).
 * However, due to synchronization overhead, Vector is generally slower than ArrayList for single-threaded
 * operations. It is recommended to use ArrayList in most cases unless thread safety is required.
 */


import java.util.LinkedList;


class LinkedListExamples{
    public static void main(String[] args) {
       LinkedList<String> fruits = new LinkedList<>();
       fruits.add("Apple");
       fruits.add("Banana");
       fruits.add("Orange");

       System.out.println("Fruits: " + fruits);

       fruits.add(2, "Mango");
       System.out.println("After adding Mango at index 2: " + fruits);

       // Lets more discuss about Vector class.

       

    }
}