import java.util.ArrayList;
import java.util.List;

class Algo {
    public void Merge(List<Integer> lt, int l, int mid, int h) {
        List<Integer> temp = new ArrayList<>();
        int left = l;
        int right = mid + 1;

        while (left <= mid && right <= h) {
            if (lt.get(left) < lt.get(right)) {
                temp.add(lt.get(left));
                left++;
            } else {
                temp.add(lt.get(right));
                right++;
            }
        }
        while (left <= mid) {
            temp.add(lt.get(left));
            left++;
        }

        while (right <= h) {
            temp.add(lt.get(right));
            right++;
        }

        for (int i = l; i <= h; i++) {
            lt.set(i, temp.get(i - l));
        }
    }

    public void mergeSort(List<Integer> lt, int l, int h) {
        if (l >= h) {
            return;
        }
        int mid = (l + h) / 2;
        mergeSort(lt, l, mid);
        mergeSort(lt, mid + 1, h);
        Merge(lt, l, mid, h);
    }
}

public class MergeSort {
    public static void main(String[] args) {
        List<Integer> lt = new ArrayList<>(List.of(12, 34, 5, 1, 23, 4));
        Algo obj = new Algo();
        obj.mergeSort(lt, 0, lt.size() - 1);
        System.out.println(lt);
    }
}
