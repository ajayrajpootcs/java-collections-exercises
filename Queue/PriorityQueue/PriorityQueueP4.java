package Queue.PriorityQueue;

import java.util.PriorityQueue;

//4. Write a Java program to insert a given element into a priority queue.

public class PriorityQueueP4 {
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Dark");
        pq.add("Yellow");
        pq.add("Green");
        pq.add("Pink");
        pq.add("Sky-Blue");
        System.out.println(pq);
        pq.offer("White");
        pq.offer("black");
        System.out.println(pq);

    }
}
