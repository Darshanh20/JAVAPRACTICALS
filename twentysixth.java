import java.io.*;

public class twentysixth {
    public static void main(String[] args) {
        String[] fileNames = {"file1.txt", "file2.txt", "file3.txt"};

        for (String fileName : fileNames) {
            File file = new File(fileName);
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                int lineCount = 0;
                while (reader.readLine() != null) {
                    lineCount++;
                }
                System.out.println(fileName + ": " + lineCount + " lines");
            } catch (FileNotFoundException e) {
                System.out.println("Error: File not found - " + fileName);
            } catch (IOException e) {
                System.out.println("Error: Could not read from file - " + fileName);
            }
        }
    }
}
