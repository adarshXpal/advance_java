import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Arrays;

public class stringAnagram {
    static boolean checkAnagram(String str, String str1) {
        if (str.length() != str1.length())
            return false;
        char[] arr1 = str.toCharArray();
        char[] arr2 = str1.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Map<Character, Integer> mp = new HashMap<>();
        // Map<Character, Integer> mp1 = new HashMap<>();

        // for (int i = 0; i < str.length(); i++) {
        // char ch = str.charAt(i);
        // mp.put(str.charAt(i), mp.getOrDefault(ch, 0) + 1);
        // }

        // for (int i = 0; i < str1.length(); i++) {
        // char ch = str.charAt(i);
        // mp1.put(str.charAt(i), mp1.getOrDefault(ch, 0) + 1);
        // }

        return arr1.equals(arr2);
        // for (Map.Entry<Character, Integer> en : mp.entrySet()) {
        // }
    }

    public static void main(String[] args) {
        String str = "Adarsh";
        String str1 = "Adasr";

        System.out.println(checkAnagram(str, str1));

    }
}
