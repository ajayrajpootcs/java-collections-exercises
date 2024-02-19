package Queue.PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

//2. Write a Java program to iterate through all elements in the priority queue.
public class PriorityQueueP2 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Dark");
        pq.add("Yellow");
        pq.add("Green");
        pq.add("Pink");
        pq.add("Sky-Blue");
        System.out.println(pq);

        Iterator<String> itr = pq.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.printf(element + ",");

        }

    }
}
