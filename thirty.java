import java.io.*;

public class thirty {
    public static void main(String[] args) {
        System.out.println("23DIT017 - DARSHAN HOTCHANDANI");
        String fileName = "file1.txt"; 
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName))) {

            System.out.println("Enter text to write to " + fileName + " (type 'exit' to finish):");

            String line;
            while (!(line = consoleReader.readLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(line);
                fileWriter.newLine();
            }

            System.out.println("Data written to " + fileName + " successfully.");

        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred.");
        }
    }
}
