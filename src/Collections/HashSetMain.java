package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(4);
        s.add(54);
        s.add(20);

        for (int x: s) {
            System.out.println(x);
        }
    }
}
