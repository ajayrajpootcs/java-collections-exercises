package LinkedList;

//2. Write a Java program to iterate through all elements in a linked list.
import java.util.LinkedList;

import java.util.Iterator;

public class LinkedListP2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");

        System.out.println(ll);

        // Iterating Throw For loop
        for (Integer i = 0; i < ll.size(); i++) {
            System.out.print(" " + ll.get(i));
        }
        System.out.println();
        // iterating throw For-Each loop
        for (String l : ll) {
            System.out.print(" " + l);
        }
        System.out.println();
        // Iterating Throw Iterator<>
        Iterator<String> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());

        }

    }
}
