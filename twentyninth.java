import java.io.*;

public class twentyninth {
    public static void main(String[] args) {
        System.out.println("23DIT017 - DARSHAN HOTCHANDANI");
        String sourceFileName = "file1.txt"; 
        String destinationFileName = "file2.txt"; 

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); 
            }

            System.out.println("Data copied from " + sourceFileName + " to " + destinationFileName + " successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Source file not found - " + sourceFileName);
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred.");
        }
    }
}
