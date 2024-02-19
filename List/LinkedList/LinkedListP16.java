package LinkedList;
//16. Write a Java program to shuffle elements in a linked list.

import java.util.LinkedList;
import java.util.Collections;

public class LinkedListP16 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        System.out.println("O-LinkedList: " + ll);
        Collections.shuffle(ll);
        System.out.println("Shuffling: " + ll);

    }
}
