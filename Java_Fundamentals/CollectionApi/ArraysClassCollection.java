package CollectionApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ArraysClassCollection {
    public static void main(String[] args) {
        // List<Integer> ls = new ArrayList<>(List.of(12, 2, 3, 4, 5));
        // ls.sort(Comparator.reverseOrder());
        // Iterator it = ls.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next() + " ");
        // }
        String st="Adarsh";
        st="Adasrsh";
        // String st = new String("Adarsh");
        // st= "Ada";
        int[] nums = { 12, 33, 53, 65, 24, 22, 5 };
        System.out.println("Size of the Array is: " + nums.length);
        Arrays.sort(nums);
        // Arrays.sort(nums, Comparator.reverseOrder()); // Only works for Integer[]
        // (Boxed Approach)
        //////////////////////////
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        int index = Arrays.binarySearch(nums, 24);
        System.out.println(index);
        // More Important functions for the ArrayClass
        String[] str = new String[10];
        Arrays.fill(str, "Adarsh");
        for (String s : str) {
            System.out.print(s + " ");
        }

    }

}
