package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class A {
    public void show() {
        System.out.println("heakfkal");
    }
}

interface B {
    void grow();

    void More();
}

class C extends A implements B {

    public void grow() {
        System.out.println("akfjadkf");
    }

    public void More() {
        System.out.println("akfjadkf");
    }
}

public class Demo {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>(Set.of(12, 5, 7, 3, 8));
        // List<Integer> ls = new ArrayList<>(st);
        List<Integer> ls = Arrays.asList(12, 34, 56, 8, 1);
        // List<Integer> ls = List.of(12, 34, 56, 8, 1);
        ls.set(2, 41);
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Comparator<String> com2 = new Comparator<String>() {
            public int compare(String i, String j) {
                if (i.length() > j.length()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        System.out.println(ls);
        Collections.sort(ls, com);
        System.out.println(ls);
        // for (int i = 0; i < ls.size(); i++) {
        // System.out.println(ls.get(i));
        // }
    }
}
