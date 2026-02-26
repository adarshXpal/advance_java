import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println();
        System.out.println("The Nth Position is: " + fibonacci(n));
        String str = "Adarsh";
        System.out.println(str.charAt(0) - 'A');

        // int f = 0, s = 1;
        // int t = 1;
        // if (n == 0 || n == 1) {
        // System.out.println("The Nth position is: " + n);
        // } else {
        // for (int i = 2; i <= n; i++) {
        // int temp = s;
        // s += f;
        // f = temp;
        // }
        // System.out.println("The Nth position is: " + s);
        // }
    }
}
