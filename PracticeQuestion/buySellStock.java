public class buySellStock {
    public static int buySell(int[] arr) {
        // int maxProfit = Integer.MIN_VALUE;

        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[j] - arr[i] > maxProfit) {
        // maxProfit = arr[j] - arr[i];
        // }
        // }
        // }
        // if (maxProfit > 0) {
        // return maxProfit;
        // }
        // return 0;
        int minSoFar = arr[0];
        int res = 0;

        for (int i = 1; i < arr.length; i++) {
            minSoFar = Math.min(minSoFar, arr[i]);
            res = Math.max(res, arr[i] - minSoFar);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 9, 11 };
        System.out.println(buySell(arr));
    }
}
