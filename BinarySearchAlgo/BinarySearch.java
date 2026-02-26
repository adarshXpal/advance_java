import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class BinarySearchAlgo {
    public int binarySearch(List<Integer> lt, int key) {
        int s = 0, e = lt.size() - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (lt.get(mid) > key) {
                e = mid - 1;
            } else if (lt.get(mid) < key) {
                s = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> lt = new ArrayList<>(List.of(12, 34, 56, 2, 4, 11));

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                return (i < j) ? 1 : -1;
            }
        };
        Collections.sort(lt);

        BinarySearchAlgo obj = new BinarySearchAlgo();

        int index = obj.binarySearch(lt, 113);
        System.out.println("Index of Key: " + index);

        Iterator<Integer> it = lt.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
