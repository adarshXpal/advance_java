package Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;

public class LearnSet {
    public static void main(String[] args) {
        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("Adarsh", 113));
        students.add(new Student("Aditya", 34));
        students.add(new Student("Ramesh", 13));
        students.add(new Student("Akhilesh", 98));
        students.add(new Student("Akhilesh", 98));

        System.out.println(students);

        Student s1 = new Student("Aditi", 51);
        Student s2 = new Student("Suresh", 561);

        System.out.println("Performing the compareTo() Method: " + s1.compareTo(s2));

        boolean flag = s1.equals(s2);

        List<Student> ls = new ArrayList<>();

        ls.add(new Student("Adarsh", 113));
        ls.add(new Student("Aditya", 34));
        ls.add(new Student("Ramesh", 13));
        ls.add(new Student("Akhilesh", 98));
        ls.add(new Student("Akhilesh", 98));

        Collections.sort(ls);

        Collections.sort(ls, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        // Same as above using Lamda
        Collections.sort(ls, (o1, o2) -> o1.name.compareTo(o2.name));

        System.out.println();
        System.out.println(ls);

        System.out.println("The result: " + flag);

        // String str1 = "Adarsh";
        // String str2 = "Neelam";
        // System.out.println(str1.compareTo(str2));

    }
}
