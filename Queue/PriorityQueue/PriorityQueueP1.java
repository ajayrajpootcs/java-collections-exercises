package Queue.PriorityQueue;

import java.util.PriorityQueue;

//1. Write a Java program to create a priority queue, add some colors (strings) and print out the elements of the priority queue.
public class PriorityQueueP1 {
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Dark");
        pq.add("Yellow");
        pq.add("Green");
        pq.add("Pink");
        pq.add("Sky-Blue");
        System.out.println(pq);

    }
}