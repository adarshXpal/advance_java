public class maxSubarraySum {
    static int subArraySum(int[] arr) {
        int temp = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + temp < 0) {
                temp = 0;
            }
            temp += arr[i];
            res = Math.max(res, temp);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 7, 8 };
        System.out.println(subArraySum(arr));
    }
}
