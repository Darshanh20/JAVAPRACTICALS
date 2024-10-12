class FirstThread extends Thread {
    public FirstThread() {
        super("FIRST"); 
    }

    @Override
    public void run() {
        System.out.println(getName() + " with priority " + getPriority() + " is running.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
    }
}

class SecondThread extends Thread {
    public SecondThread() {
        super("SECOND"); 
    }

    @Override
    public void run() {
        System.out.println(getName() + " with priority " + getPriority() + " is running.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
    }
}

class ThirdThread extends Thread {
    public ThirdThread() {
        super("THIRD");
    }

    @Override
    public void run() {
        System.out.println(getName() + " with priority " + getPriority() + " is running.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
    }
}

public class thirtyfive {
    public static void main(String[] args) {
        System.out.println("23DIT017 - DARSHAN HOTCHANDANI");
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();
        ThirdThread thirdThread = new ThirdThread();

        firstThread.setPriority(3);
        secondThread.setPriority(Thread.NORM_PRIORITY);  
        thirdThread.setPriority(7); 

        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}

