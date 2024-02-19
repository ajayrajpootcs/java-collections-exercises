package Queue.PriorityQueue;

import java.util.PriorityQueue;

//6. Write a Java program to count the number of elements in a priority queue.
public class PriorityQueueP6 {
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Dark");
        pq.add("Yellow");
        pq.add("Green");
        pq.add("Pink");
        pq.add("Sky-Blue");
        System.out.println(pq.size());
        int count = 0;
        for (String string : pq) {
            count += 1;
        }
        System.out.println(count);

    }
}
