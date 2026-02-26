package CollectionApi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class HashsetCollection {
    public static void main(String[] args) throws IOException {
        List<Integer> lt = new ArrayList<>(List.of(23, 45, 65, 22));
        lt.add(212);

        Set<Integer> st = new HashSet<Integer>(lt);
        Queue<Integer> qu = new LinkedList<>(st);
        lt.add(23);
        System.out.println("Queue with LinkedList: " + qu);

        InputStreamReader ip = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ip);
        try {
            Double temp = Double.parseDouble(br.readLine());
            System.out.println("Value of Temp: " + temp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            br.close();
            ip.close();
        }

        // st = Set.of(12, 34, 56, 67, 2);
        // st.remove(34);
        Iterator<Integer> it = st.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}
