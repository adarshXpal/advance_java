class Algo {
    public int Partition(int[] nums, int l, int h) {
        int pivot = nums[l];
        int i = l, j = h;
        while (i < j) {
            while (nums[i] <= pivot && i < h) {
                i++;
            }

            while (nums[j] >= pivot && j > l ) {
                j--;
            }

            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[j];
        nums[j] = nums[l];
        nums[l] = temp;

        return j;
    }

    public void QuickSort(int[] nums, int l, int h) {
        if (l > h) {
            return;
        }
        int pindex = Partition(nums, l, h);
        QuickSort(nums, l, pindex - 1);
        QuickSort(nums, pindex + 1, h);
    }
}

public class Demo {
    public static void main(String[] args) {
        int[] nums = { 12, 56, 32, 7, 1, 72, 56 };
        int i = 0, j = nums.length - 1;
        Algo obj = new Algo();
        obj.QuickSort(nums, i, j);

        for (int it : nums) {
            System.out.print(it + " ");
        }
        System.out.println();

    }
}
