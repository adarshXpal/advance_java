package CollectionApi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapUtil {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Adarsh", 12);
        students.put("Rathik", 32);
        students.put("Sasmiya", 22);
        students.put("Sameer", 21);

        // System.out.println(students.values());
        Iterator<String> str = students.keySet().iterator();
        while(str.hasNext()){
            String temp=str.next();
            System.out.println(temp+": "+students.get(temp));
        }

        // for (String key : students.keySet()) {
        //     System.out.println(key + ": " + students.get(key));
        // }
    }
}
