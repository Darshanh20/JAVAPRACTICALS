import java.util.LinkedList;

class ProducerConsumer {
    private final LinkedList<Integer> buffer;
    private final int capacity; 

    public ProducerConsumer(int capacity) {
        this.buffer = new LinkedList<>();
        this.capacity = capacity;
    }

    // Method for producing items
    public void produce(int item) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == capacity) {
                System.out.println("Buffer is full, producer is waiting...");
                wait(); 
            }
            buffer.add(item);
            System.out.println("Produced: " + item);
            notify(); 
        }
    }

    public int consume() throws InterruptedException {
        synchronized (this) {
            while (buffer.isEmpty()) {
                System.out.println("Buffer is empty, consumer is waiting...");
                wait(); 
            }
            int item = buffer.removeFirst();
            System.out.println("Consumed: " + item);
            notify(); 
            return item;
        }
    }
}

class Producer implements Runnable {
    private final ProducerConsumer pc;

    public Producer(ProducerConsumer pc) {
        this.pc = pc;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                pc.produce(i); 
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer implements Runnable {
    private final ProducerConsumer pc;

    public Consumer(ProducerConsumer pc) {
        this.pc = pc;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                pc.consume(); 
                Thread.sleep(150); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class thirtysix {
    public static void main(String[] args) {
        System.out.println("23DIT017 - DARSHAN HOTCHANDANI");
        ProducerConsumer pc = new ProducerConsumer(5); 

        Thread producerThread = new Thread(new Producer(pc));
        Thread consumerThread = new Thread(new Consumer(pc));

        producerThread.start(); 
        consumerThread.start(); 

        try {
            producerThread.join(); 
            consumerThread.join(); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
