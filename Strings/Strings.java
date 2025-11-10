/*
Strings
- A string is an object that represents a sequence of characters.
*/

public class Strings {
    public static void main(String[] args) {
        // Creating a string
        // 1. Using string literal (literal meaning without new keyword, directly assigning the value)
        String greeting = "Hello, World!!";
        System.out.println(greeting);

        // 2. Using new keyword (String Objection creation in the heap memory, dynamic memory allocation)
        String farewall = new String("Goodbye, World!!!");
        System.out.print(farewall + "\n");

        greeting = "Fare"; // reassigning value, creates a new string and assign to greeting
        System.out.println(greeting);

        // Types of Strings
        // 1. Immutable Strings - Strings created using string literals are immutable.
        // 2. mutable Strings - Strings created using StringBuilder or StringBuffer are mutable.

        // String concatenation
        String name = "Alice";
        String personalizedGreeting = greeting + " Welcome " + name + "!";
        System.out.println(personalizedGreeting);

        // iterating over string characters
        for(char characters : personalizedGreeting.toCharArray()) {
            System.out.print(characters);
        }

        System.out.println(); // for new line

        // String length
        int length = personalizedGreeting.length();
        System.out.println("Length of the greeting: " + length);


        // (mutable string)
        // Two classes provide mutable strings: StringBuilder and StringBuffer.
    
        // 1. String Builder
        // String Builder is a class in java, represents a mutable sequence of characters. 
        // and it is not thread safe.

        StringBuilder sbuilder = new StringBuilder("Mutable String");
        System.out.print(sbuilder.capacity() + "\n"); // default capacity is 16 + length of string
        sbuilder.append(" Example for many more characters, so that capacity increases.");
        System.out.println(sbuilder.toString());
        System.out.print(sbuilder.capacity() + "\n"); // default capacity is 16 + length of string

        // 2. String Buffer
        // String Buffer is a class in java, represents a mutable sequence of characters. 
        // and it is thread safe.
        StringBuffer sb = new StringBuffer("Mutable String");
        System.out.print(sb.capacity() + "\n"); // default capacity is 16 + length of string
        sb.append(" Example for many more characters, so that capacity increases.");
        System.out.println(sb.toString());
        System.out.print(sb.capacity() + "\n"); // default capacity is 16 + length of string

    } 
}
