package Collections.Sorting;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, 25, "Mohit", 75),
                new Student(2, 27, "Ayushi", 90),
                new Student(3, 24, "Vidushi", 85)
        ));

        Collections.sort(students,(o1, o2) -> {
            if(o1.age == o2.age){
                return 0;
            } else if(o1.age < o2.age){
                return -1;
            }
            return 1;
        });

        System.out.println("Hey!");
    }
}
