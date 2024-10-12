import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class prac28 {
    public static void main(String[] args) {
        // Take file name and word to search as input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name (with path if needed): ");
        String fileName = scanner.nextLine();
        
        System.out.print("Enter word to search: ");
        String searchWord = scanner.nextLine();

        // Try to search for the word in the file
        try {
            if (searchWordInFile(fileName, searchWord)) {
                System.out.println("Word '" + searchWord + "' found in the file.");
            } else {
                System.out.println("Word '" + searchWord + "' not found in the file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        // Demonstrate usage of Wrapper Class
        demonstrateWrapperClass();
    }

    // Method to search for a word in a file
    public static boolean searchWordInFile(String fileName, String word) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(word)) {
                    return true; // Word found
                }
            }
        }
        return false; // Word not found
    }

    // Example demonstrating the use of Wrapper Class
    public static void demonstrateWrapperClass() {
        System.out.println("\nWrapper Class Example:");

        // Wrapper classes for primitive types
        Integer intObject = Integer.valueOf(10);  // Boxing
        int intPrimitive = intObject.intValue();  // Unboxing

        System.out.println("Boxed Integer: " + intObject);
        System.out.println("Unboxed Integer: " + intPrimitive);

        // Autoboxing and Autounboxing
        Double doubleObject = 5.5; // Autoboxing
        double doublePrimitive = doubleObject;  // Autounboxing

        System.out.println("Autoboxed Double: " + doubleObject);
        System.out.println("Autounboxed Double: " + doublePrimitive);
    }
}
