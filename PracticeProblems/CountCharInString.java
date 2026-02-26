import java.util.HashMap;
import java.util.Map;

public class CountCharInString {
    public static void main(String[] args) {
        String str = "Adarsh Pal Adarsh Pal";

        Map<Character, Integer> mp = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            } else {
                mp.put(c, 1);
            }
        }
        System.out.println("Printing Below:");
        for (Map.Entry<Character, Integer> e : mp.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}
