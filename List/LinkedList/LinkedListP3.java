package LinkedList;

//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
import java.util.LinkedList;

import java.util.Iterator;

public class LinkedListP3 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        for (Integer i = 2; i < ll.size(); i++) {
            System.out.print(" " + ll.get(i));
        }
        System.out.println();
        // or
        Iterator<String> itr = ll.listIterator(2);
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }

    }
}
