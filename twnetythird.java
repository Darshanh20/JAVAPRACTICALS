import java.util.InputMismatchException;
import java.util.Scanner;

public class twnetythird {
    public static void main(String[] args) {
        System.out.println("23DIT017 - DARSHAN HOTCHANDANI");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator (x): ");
            int x = scanner.nextInt();

            System.out.print("Enter the denominator (y): ");
            int y = scanner.nextInt();

            int result = x / y;
            System.out.println("Result of " + x + " / " + y + " is: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Input must be an integer.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
