package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMain {
    public static void main(String[] args) {
        Set<Integer> s = new LinkedHashSet<>();
        s.add(10);
        s.add(4);
        s.add(54);
        s.add(20);

        for (int x: s) {
            System.out.println(x);
        }
    }
}
