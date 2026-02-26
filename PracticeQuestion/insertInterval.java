import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class insertInterval {
    public static int[][] solution(int[][] arr) {
        if (arr.length == 1) {
            return arr;
        }
        // int[][] sol = new int[arr.length][arr[0].length];
        List<int[]> sol = new ArrayList<int[]>();
        sol.add(arr[0]);
        // sol[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] <= sol.get(sol.size() - 1)[1]) {
                sol.get(sol.size() - 1)[1] = arr[i][1];
            } else {
                sol.add(arr[i]);
                // sol.set(i, arr[i]);
            }
        }
        // return Arrays(sol);
        return sol.toArray(new int[sol.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 5, 9 }, { 10, 12 }, { 2, 5 } };// 1-3 2-5 5-9 7-12
        // Comparator<int[]> com = new Comparator<int[]>((o1, o2) -> {
        // return o1[0] - o2[0];
        // });
        
        Comparator<int[]> com = new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        };
        Arrays.sort(intervals, com);
        int[][] res = solution(intervals);
        for (int[] i : res) {
            System.out.println(i[0] + " " + i[1]);
        }
    }
}
