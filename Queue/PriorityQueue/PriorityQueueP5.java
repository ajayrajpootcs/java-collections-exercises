package Queue.PriorityQueue;

import java.util.PriorityQueue;

//5. Write a Java program to remove all elements from a priority queue
public class PriorityQueueP5 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Dark");
        pq.add("Yellow");
        pq.add("Green");
        pq.add("Pink");
        pq.add("Sky-Blue");
        System.out.println(pq);
        // pq.clear();
        pq.removeAll(pq);
        System.out.println("Removed All" + pq);

    }

}
