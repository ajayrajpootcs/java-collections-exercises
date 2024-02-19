package Queue.PriorityQueue;

import java.util.PriorityQueue;

//8. Write a Java program to retrieve the first element of the priority queue.
public class PriorityQueueP8 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Dark");
        pq.add("Yellow");
        pq.add("Green");
        pq.add("Pink");
        pq.add("Sky-Blue");
        System.out.println(pq);
        System.out.println("First element : " + pq.peek());
    }
}
