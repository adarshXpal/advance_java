package ThreadScheduling;

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter cnt = new Counter();

        Runnable obj1 = () -> {
            for(int i =0;i<2000;i++){
                cnt.increment();
            }
        };

        Runnable obj2 = () -> {
            for(int i =0;i<2000;i++){
                cnt.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(cnt.count);
    }
}
