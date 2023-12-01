package Collections;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class PriorityQueueMain {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("asd");
        pq.add("ddfg");
        pq.add("lkj");
        pq.add("qwe");

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
