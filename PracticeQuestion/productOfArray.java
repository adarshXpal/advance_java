public class productOfArray {
    static int[] exceptSelf(int[] arr) {
        int[] res = new int[arr.length];
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        for (int i = 0; i < arr.length; i++) {
            res[i] = product / arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 3, 5, 6, 2 };
        int[] res = exceptSelf(arr);

        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
