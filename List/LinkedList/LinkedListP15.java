package LinkedList;

import java.util.Collections;
//15. Write a Java program that swaps two elements in a linked list.
import java.util.LinkedList;

public class LinkedListP15 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        System.out.println("O-LinkedList: " + ll);
        Collections.swap(ll, 1, 3);
        System.out.println("After Sawpping: " + ll);

    }
}
