import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Gatherer.Integrator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

class SelectionSort {
    void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[min] > nums[j]) {
                    min = j;
                }
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }

    void selectionSort(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            int min = i;
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(min) > nums.get(j)) {
                    min = j;
                }
            }
            Collections.swap(nums, i, min);
        }
    }

    void bubbleSort(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 1; j < nums.size() - i; j++) {
                if (nums.get(j - 1) > nums.get(j)) {
                    Collections.swap(nums, j - 1, j);
                }
            }
        }
    }

    void insertionSort(List<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            int j = i;
            while (j > 0 && nums.get(j - 1) > nums.get(j)) {
                Collections.swap(nums, j, j - 1);
                j--;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int[] nums = { 12, 44, 1, 6, 8, 12 };
        List<Integer> ls = Arrays.stream(nums).boxed().collect(Collectors.toList());
        // List<Integer> ls = new ArrayList<Integer>(List.of(12, 33, 4, 1, 5));
        // obj.selectionSort(nums);
        // obj.selectionSort(ls);
        // obj.bubbleSort(ls);
        obj.insertionSort(ls);
        for (int i : ls) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
