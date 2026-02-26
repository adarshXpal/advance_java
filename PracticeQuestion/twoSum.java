import java.util.Arrays;

public class twoSum {
    public static boolean twoSumBool(int[] arr, int target) {
        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] + arr[j] == target) {
        // return true;
        // }
        // }
        // }
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] < target) {
                i++;
            } else if (arr[i] + arr[j] > target) {
                j--;
            } else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, -1, 0, 5 };
        Arrays.sort(arr);
        int target = 0;
        System.out.println(twoSumBool(arr, target));
    }
}
