package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListStream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12, 4, 56, 893, 2, 5);
        Optional<Integer> sum = nums.stream().reduce((a, b) -> a + b);
        Optional<Integer> max = nums.stream().reduce(Integer::max);

        if (max.isPresent()) {
            System.out.println(max.get());
        } else {
            System.out.println("Element is not present !!");
        }

        Set<Integer> st = nums.stream()
                .sorted()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toSet());
        // .forEach(n -> System.out.println(n));

    }
}
