class HelloWorldThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello World from Thread!");
    }
}

class HelloWorldRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World from Runnable!");
    }
}

public class thirtyone {
    public static void main(String[] args) {
        System.out.println("23DIT017 - DARSHAN HOTCHANDANI");
        HelloWorldThread thread1 = new HelloWorldThread();
        thread1.start(); 

        Thread thread2 = new Thread(new HelloWorldRunnable());
        thread2.start(); 
    }
}
