package CollectionApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;

// abstract class A{
//      abstract void show();
//     // public void call(){
//     //     System.out.println("Calling you");
//     // }
// }

public class HashMapCollection {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();
        // List<Integer> ls= new ArrayList<>(numbers.values()) ;
        List<Map> ls = new ArrayList<>();
        numbers.put("Adasrsh", 32);
        numbers.put("Akhilesh", 33);
        numbers.put("Neelam", 41);
        numbers.put("Vijay", 34);
        numbers.put("Vijay", 90);// This will override the key Value
        // Used to remove the Key-Pair
        ls.add(numbers);

        System.out.println("The value of MapList: " + ls.get(0));
        numbers.remove("Vijay");

        // This is very Important for Iteration in Map
        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
        // System.out.println("Now the clear Map");
        // numbers.clear();
        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        for (String value : numbers.keySet()) {
            System.out.print(value + " ");
        }
        System.out.println();
        for (Integer value : numbers.values()) {
            System.out.print(value + " ");
        }
        System.out.println();
        String s = "Adarsh";
        s = s.concat(" Pal");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        // Other types of Map
        Map<Integer, String> mp = new TreeMap<>();
        // Map<Integer, String> mp = new LinkedHashMap<>();
        mp.put(9, "Rehman");
        mp.put(13, "Badi KasaiNuma Hoti Hai");
        mp.put(10, "Daket");
        mp.put(11, "Ki Maut");
        for (Map.Entry<Integer, String> e : mp.entrySet()) {
            System.out.print(e.getValue()+" ");
        }
    }
}
