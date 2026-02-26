package ThreadScheduling;

public class ThreadScheduling {
    public static void main(String[] args) {
        // Runnable obj1 = () -> {
        // int g = 0;
        // for (int i = 0; i < 10; i++) {
        // System.out.println("A " + g++);

        // try {
        // Thread.sleep(10);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // }
        // };
        // Runnable obj2 = () -> {
        // int j = 0;

        // for (int i = 0; i < 10; i++) {
        // System.out.println("B " + j++);
        // try {
        // Thread.sleep(10);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // }
        // };
        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);

        // t1.start();
        // t2.start();

        Runnable obj1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
