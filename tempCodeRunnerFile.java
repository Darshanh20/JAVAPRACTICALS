import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        // Ensure one argument is provided
        if (args.length != 1) {
            System.out.println("Please enter exactly one character as an argument.");
            return; // Exit the program
        }

        String input = args[0];
        // Check if the argument is a single character
        if (input.length() != 1) {
            System.out.println("Please enter only one character.");
            return; // Exit the program
        }

        char targetChar = input.charAt(0);
        int count = 0;

        try {
            File file = new File("file1.txt");
            Scanner sc = new Scanner(file);
            
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                // Count occurrences of targetChar in the current line
                for (int j = 0; j < line.length(); j++) {
                    if (line.charAt(j) == targetChar) {
                        count++;
                    }
                }
            }

            System.out.println("There are " + count + " occurrences of '" + targetChar + "' in the file.");
            sc.close(); // Close the scanner

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
