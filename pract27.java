import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pract27 {
    public static void main(String[] args) {
        System.out.println("23DIT017 - DARSHAN HOTCHANDANI");
        if (args.length != 1) {
            System.out.println("Please enter exactly one character as an argument.");
            return; 
        }

        String input = args[0];
        if (input.length() != 1) {
            System.out.println("Please enter only one character.");
            return;
        }

        char targetChar = input.charAt(0);
        int count = 0;

        try {
            File file = new File("file1.txt");
            Scanner sc = new Scanner(file);
            
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                for (int j = 0; j < line.length(); j++) {
                    if (line.charAt(j) == targetChar) {
                        count++;
                    }
                }
            }

            System.out.println("There are " + count + " occurrences of '" + targetChar + "' in the file.");
            sc.close(); 

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
