public class containerWithMostWater {
    static int mostWater(int[] arr) {
        int res = 0;
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = (j - i) * Math.abs(arr[j] - arr[i]);
            res = Math.max(res, temp);
            if (arr[i] > arr[j])
                j--;
            else
                i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 3,1,2,4,5 };
        System.out.println(mostWater(arr));
    }
}
