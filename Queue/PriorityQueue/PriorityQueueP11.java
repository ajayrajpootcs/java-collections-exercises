package Queue.PriorityQueue;

import java.util.PriorityQueue;

//11. Write a Java program to convert a Priority Queue element to string representations.
public class PriorityQueueP11 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Dark");
        pq.add("Yellow");
        pq.add("Green");
        pq.add("Pink");
        pq.add("Sky-Blue");
        System.out.println(pq);
        String str = pq.toString();
        System.out.println(str);

    }
}
