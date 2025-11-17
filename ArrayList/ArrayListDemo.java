/**
 * ArrayList in Java: implements the List interface, is a resizable array, found in java.util package.
 * they are bit different from arrays as arrays have a fixed length whereas ArrayList can grow and shrink dynamically as elements are added or removed.
 */


import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

       System.out.println(numbers);

    }
}
