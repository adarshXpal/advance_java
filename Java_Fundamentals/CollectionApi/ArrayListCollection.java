package CollectionApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ArrayListCollection {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        List<Integer> hums = List.of(12, 89, 522);
        List<Integer> chumn = new ArrayList<>(Arrays.asList(12, 223, 4, 5, 6));
        Collections.sort(chumn);
        // chumn.remove(3);
        // chumn.set(3, 5);
        System.out.println("The sorted array");
        for (int i : chumn) {
            System.out.print(i + " ");
        }
        System.out.println();

        nums.add(12);
        nums.add(10);
        nums.add(342);
        nums.add(522);
        nums.add(332);
        nums.add(17);
        nums.add(4, 89);
        nums.add(4, 89);

        System.out.println(nums);
        boolean fg = nums.containsAll(hums);
        System.out.println("Here is fg: " + fg);

        List<Integer> newNums = new ArrayList<Integer>();
        newNums.add(22);
        newNums.add(69);

        nums.addAll(newNums);

        int index = nums.indexOf(Integer.valueOf(69));
        System.out.println("Index of 69: " + index);

        System.out.println(nums);

        System.out.println(nums.get(4));
        nums.remove(Integer.valueOf(89)); // Removal of Integer 89 in the list.
        nums.remove(2); // Removal at Index 2.
        System.out.println(nums);

        nums.set(4, 49);
        System.out.println(nums);

        System.out.println("Iteration through int i");
        for (int i = 0; i < nums.size(); i++) {
            System.out.println("Element at index " + i + ": " + nums.get(i));
        }

        System.out.println("Iteration through Iterator");
        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {
            System.out.println("Next Element is: " + it.next());
        }
        System.out.println("Iteration through ForEach");
        for (int i : nums) {
            System.out.println("Iteration through forEach loop: " + i);
        }

        // List Implementation using LinkedList Object
        List<Integer> lt = new LinkedList<>();
        lt.add(23);
        lt.add(21);
        lt.add(78);
        lt.add(98);
        // lt.offer(21);
        System.out.println(lt.get(3));
        Comparator<Integer> com = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'compare'");
            }

        };
        // Collections.sort(nums);
        Collections.sort(nums, Comparator.reverseOrder());
        System.out.println(nums);
        // nums.clear();
        // System.out.println("Here is the empty List: " + nums);
    }
}
