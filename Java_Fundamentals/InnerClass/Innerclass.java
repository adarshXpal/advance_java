package InnerClass;

import java.util.Scanner;

class A {
    int num;

    public A(int num) {
        this.num = num;
    }

    public int getNum() {
        return this.num;
    }

    static class B {
        public B(int temp) {
            this.temp = temp;
        }

        int temp;

        public int getTemp() {
            return this.temp;
        }
    }
}

public class Innerclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value num: ");
        int num = sc.nextInt();
        System.out.println("Enter the value temp: ");
        int temp = sc.nextInt();
        sc.close();
        A obj = new A(num);
        A.B obj2 = new A.B(temp);

        System.out.println("hey the value of temp is: " + obj2.getTemp());


    }
}
