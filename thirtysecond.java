import java.util.Scanner;

class SumThread extends Thread {
    private int start;
    private int end;
    private int[] numbers;
    private int sum = 0;

    public SumThread(int start, int end, int[] numbers) {
        this.start = start;
        this.end = end;
        this.numbers = numbers;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
    }

    public int getSum() {
        return sum;
    }
}

public class thirtysecond {
    public static void main(String[] args) {
        System.out.println("23DIT017 - DARSHAN HOTCHANDANI");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.print("Enter the number of threads: ");
        int numThreads = scanner.nextInt();

        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = i + 1; 
        }

        int chunkSize = N / numThreads;
        SumThread[] threads = new SumThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? N : start + chunkSize; 

            threads[i] = new SumThread(start, end, numbers);
            threads[i].start();
        }

        int totalSum = 0;
        try {
            for (int i = 0; i < numThreads; i++) {
                threads[i].join(); 
                totalSum += threads[i].getSum(); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The sum of numbers from 1 to " + N + " is: " + totalSum);
        scanner.close();
    }
}
