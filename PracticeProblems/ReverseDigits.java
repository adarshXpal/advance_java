import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println();

        int result = 0;
        while (n > 0) {
            result *= 10;
            result += n % 10;
            n /= 10;
        }
        System.out.println("Result: "+result);
    }
}
