import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println();
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        System.out.println("No of Digits in N: " + count);
    }
}
