class Incrementer extends Thread {
    private int value;

    public Incrementer() {
        this.value = 0; 
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
                break;
            }
            value++; 
            System.out.println("Current Value: " + value); 
        }
    }
}

public class thirtyfour {
    public static void main(String[] args) {
        System.out.println("23DIT017 - DARSHAN HOTCHANDANI");
        Incrementer incrementer = new Incrementer(); 
        incrementer.start(); 
    }
}
