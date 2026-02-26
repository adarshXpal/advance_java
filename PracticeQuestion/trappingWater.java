public class trappingWater {
    static int trappedWater(int[] arr) {
        int[] left = new int[arr.length];
        left[0] = arr[0];
        int[] right = new int[arr.length];
        right[arr.length - 1] = arr[arr.length - 1];
        int res = 0;
        for (int i = 1; i < arr.length; i++) {

            int j = arr.length - 1 - i;

            if (arr[i] > left[i - 1]) {
                left[i] = arr[i];
            } else {
                left[i] = left[i - 1];
            }

            if (arr[j] > right[j + 1]) {
                right[j] = arr[j];
            } else {
                right[j] = right[j + 1];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            res += Math.min(left[i], right[i]) - arr[i];
        }

        return res;

    }

    public static void main(String[] args) {
        int[] arr = { 3, 0, 2, 0, 4 };
        System.out.println(trappedWater(arr));
    }
}
