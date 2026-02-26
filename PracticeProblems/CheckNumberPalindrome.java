import java.util.Scanner;

public class CheckNumberPalindrome {
    public static void main(String[] args) {

        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println();
        int original = n;
        int result = 0;
        while (n > 0) {
            result *= 10;
            result += n % 10;
            n /= 10;
        }
        if (result == original) {
            System.out.println("Yes !!");
        } else {
            System.out.println("No !!");
        }

    }
}
