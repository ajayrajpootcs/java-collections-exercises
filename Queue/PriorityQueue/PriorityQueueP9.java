package Queue.PriorityQueue;

import java.util.PriorityQueue;

//9. Write a Java program to retrieve and remove the first element.
public class PriorityQueueP9 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Dark");
        pq.add("Yellow");
        pq.add("Green");
        pq.add("Pink");
        pq.add("Sky-Blue");
        System.out.println("Retrieve And Remove First element:" + pq.poll());

    }
}
