package ThreadScheduling;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerProblem {
    int capacity;
    Queue<Integer> queue = new LinkedList<>();

    public ProducerConsumerProblem(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int value) throws InterruptedException {
        if (queue.size() == capacity) {
            wait();
        }
        queue.offer(value);
        System.out.println("Produced Value: " + value);
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        if (queue.isEmpty()) {
            wait();
        }
        int val = queue.poll();
        System.out.println("Consumed Value: " + val);
        notifyAll();
    }

    public static void main(String[] args) {
        ProducerConsumerProblem obj = new ProducerConsumerProblem(10);
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(6);

        Thread t1 = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    // obj.produce(i);
                    bq.put(i);//Blocks the thread if full
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    bq.take(); //blocks if empty
                    // obj.consume();
                    Thread.sleep(160);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}
