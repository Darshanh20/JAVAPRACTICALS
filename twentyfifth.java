
import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class twentyfifth {

    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age is below 18, access denied!");
        } else {
            System.out.println("Age is valid, access granted.");
        }
    }

    public static void main(String[] args) {
        System.out.println("23DIT017 - DARSHAN HOTCHANDANIA");
        System.out.println("Enter the age: ");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        try {
            checkAge(n);
        } catch (AgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

