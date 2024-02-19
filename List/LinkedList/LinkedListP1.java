package LinkedList;

import java.util.LinkedList;

//1. Write a Java program to append the specified element to the end of a linked list.
public class LinkedListP1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        System.out.println(ll);
        ll.add(0, "Dell");
        System.out.println(ll);

    }

}
