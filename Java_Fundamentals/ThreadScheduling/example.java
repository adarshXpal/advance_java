package ThreadScheduling;

// class A {
//     public void show() {
//         System.out.println("Hello Julie");
//     }
// }

// class B extends A implements Runnable {
//     public void run() {
//         this.show();
//         System.out.println("Hi Jamie");
//     }
// }

class C extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world");
        }
    }
}

public class example {
    public static void main(String[] args) {
        // Runnable obj = new B();
        // Thread t1 = new Thread(obj);
        // t1.start();
        Thread t1 = new C();
        t1.start();
    }
}
