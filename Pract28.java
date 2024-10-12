import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Pract28 {
    public static void main(String[] args) {
        File f = new File("file1.txt"); 

        while (!f.exists()) {
            Scanner scaa = new Scanner(System.in);
            System.out.println(f.getName() + " does not exist. Please enter a correct file path:");
            String filePath = scaa.nextLine();
            f = new File(filePath);
        }

        try {
            FileReader f1 = new FileReader(f);
            Scanner sca = new Scanner(f);
            int i = 0;

            while (sca.hasNextLine()) {
                sca.nextLine();
                i++;
            }

            String[] lines = new String[i];
            Scanner sc = new Scanner(f1);
            int x = 0;

            while (sc.hasNextLine()) {
                lines[x] = sc.nextLine();
                x++;
            }

            Scanner userInputScanner = new Scanner(System.in);
            System.out.println("Enter a word to search:");
            String userWord = userInputScanner.nextLine();
            boolean found = false; 

            for (int lineIndex = 0; lineIndex < lines.length; lineIndex++) {
                StringTokenizer tokenizer = new StringTokenizer(lines[lineIndex]);
                while (tokenizer.hasMoreTokens()) {
                    if (userWord.equals(tokenizer.nextToken())) {
                        System.out.println("Word '" + userWord + "' found in line " + (lineIndex + 1));
                        found = true; 
                        break; 
                    }
                }
            }

            if (!found) {
                System.out.println("Word '" + userWord + "' not found in the file.");
            }

            sc.close();
            userInputScanner.close();

        } catch (IOException e) {
            System.out.println("ERROR! An IOException occurred.");
            e.printStackTrace();
        }

    }
}
