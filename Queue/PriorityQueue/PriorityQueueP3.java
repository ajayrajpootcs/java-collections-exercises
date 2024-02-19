package Queue.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
//3. Write a Java program to add all the elements of a priority queue to another priority queue.

public class PriorityQueueP3 {
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add("Dark");
        pq.add("Yellow");
        pq.add("Green");
        pq.add("Pink");
        pq.add("Sky-Blue");

        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("Bhagwa");
        pq2.addAll(pq);
        System.out.println("PQ1 Elements With MAX-HEAP: " + pq);
        System.out.println("PQ1 Elements With MIN-HEAP: " + pq2);

    }
}