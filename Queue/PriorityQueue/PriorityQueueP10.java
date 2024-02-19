package Queue.PriorityQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

//10. Write a Java program to convert a priority queue to an array containing all its elements.
public class PriorityQueueP10 {
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Dark");
        pq.add("Yellow");
        pq.add("Green");
        pq.add("Pink");
        pq.add("Sky-Blue");
        System.out.println(pq);
        System.out.println("To Array");
        // pq.toArray();
        // System.out.println(pq);
        ArrayList<String> al = new ArrayList<>(pq);
        System.out.println(al);

    }
}
