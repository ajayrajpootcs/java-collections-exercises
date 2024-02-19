package Queue.PriorityQueue;

import java.util.PriorityQueue;

//7. Write a Java program to compare two priority queues.
public class PriorityQueueP7 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Dark");
        pq.add("Yellow");
        pq.add("Green");
        pq.add("Pink");
        pq.add("Sky-Blue");

        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("Bhagwa Rang");
        pq2.add("Yellow");
        pq2.add("Dark");
        pq2.add("Red");
        System.out.println(pq);
        System.out.println(pq2);
        for (String string : pq) {
            // [Dark, Pink, Green, Yellow, Sky-Blue]
            // [Bhagwa Rang, Red, Dark, Yellow]
            // kya pq2 Dark contain krta hai Yes
            // kya pq2 Pink contain krta hai No
            // kya pq2 Green contain krta hai No
            // kya pq2 Yellow contain krta hai Yes
            // kya pq2 Sky-Blue contain krta hai No
            System.out.println(pq2.contains(string) ? "Yes" : "No");

        }
        System.out.println("....................................");
        for (String string2 : pq2) {
            System.out.println(pq.contains(string2) ? "Yes" : "No");

        }
    }
}
