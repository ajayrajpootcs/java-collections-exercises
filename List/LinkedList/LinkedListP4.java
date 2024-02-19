package LinkedList;

//4. Write a Java program to iterate a linked list in reverse order.
import java.util.LinkedList;

import java.util.Iterator;

public class LinkedListP4 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");

        Iterator<String> itr = ll.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
