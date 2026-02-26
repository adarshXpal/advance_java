import java.util.Scanner;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();

        sc.close();
        System.out.println();
        int i = 0, j = str.length() - 1;
        boolean result = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                result = false;
            }
            i++;
            j--;
        }
        if (result) {
            System.out.println("Yes !!");
        } else {
            System.out.println("No !!");
        }
    }
}
