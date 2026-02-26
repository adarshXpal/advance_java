package ThreadScheduling;

class Q {
    int num;
    boolean flag = true;

    public synchronized void put(int num) throws InterruptedException {
        if (flag) {
            this.num = num;
            flag = false;
            System.out.println("Produced: " + this.num);
            notifyAll();
        } else {
            wait();
        }
    }

    public synchronized void get() throws InterruptedException {
        if (!flag) {
            flag = true;
            System.out.println("Consumed: " + this.num);
            notifyAll();
        } else {
            wait();
        }
    }

}

class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
    }

    public void run() {
        int i = 0;

        while (true) {
            try {
                q.put(i++);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}

class Consumer implements Runnable {
    Q q;

    public Consumer(Q q) {
        this.q = q;
    }

    public void run() {

        while (true) {
            try {
                q.get();
                Thread.sleep(600);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}

public class InnerThreadProducerConsumerProblem {
    public static void main(String[] args) {
        Q q = new Q();
        Producer obj1 = new Producer(q);
        Consumer obj2 = new Consumer(q);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
