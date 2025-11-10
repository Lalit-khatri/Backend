
import java.util.Arrays;

/*
 An Array
 - array is a data structure that is used to store elements of same data type.

 Configuration / run instructions
 - From the workspace root (/Users/.../Backend) you can compile and run this file with:
     javac Arrays/Array.java  -- (this will create Arrays/Array.class file, means it compiles the file in place)
     java -cp Arrays Array -- (this command runs the Array class present inside Arrays folder)

    - use javac Arrays/Array.java && java -cp Arrays Array (to do both in one line)

 - If you prefer to compile to a separate output directory:
     javac -d out Arrays/Array.java
     java -cp out Array

 - A sample VS Code launch configuration is provided in `.vscode/launch.json` to run this class directly from the editor.

 Notes:
 - The class has no package declaration, so the classpath when running must include the directory that contains the compiled .class file (here `Arrays`).
 - If you later add a package (for example `package arrays;`), move the file into the matching folder structure and update the launch config accordingly.
*/

public class Array {
    public static void main(String[] args) {
        // Declare an array of integers
        int[] numbers = new int[5];

        // Initialize the array
        Arrays.fill(numbers, 1);

        // Access and print elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // MultiDimestional Array
        int[][] matrix = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // to print use System.out.print("text") to print in same line

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}


