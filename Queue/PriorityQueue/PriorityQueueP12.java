package Queue.PriorityQueue;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

//12. Write a Java program to change priorityQueue to maximum priority queue.
public class PriorityQueueP12 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(10);
        pq1.add(22);
        pq1.add(36);
        pq1.add(25);
        pq1.add(16);
        pq1.add(70);
        pq1.add(82);
        pq1.add(89);
        pq1.add(14);

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.addAll(pq1);

        System.out.println("MIN HEAP " + pq1);

        System.out.println("MAX HEAP " + pq2);

    }
}
