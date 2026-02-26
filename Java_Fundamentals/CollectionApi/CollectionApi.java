package CollectionApi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionApi {
    public static void main(String[] args) {

        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(12);
        nums.add(52);
        nums.add(72);
        nums.add(22);

        Iterator<Integer> values = nums.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }

        // for (int i : nums) {
        //     System.out.println(i);
        // }
    }

}
