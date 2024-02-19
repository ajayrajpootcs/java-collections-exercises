package LinkedList;

import java.util.LinkedList;

//9. Write a Java program to insert some elements at the specified position into a linked list.
public class LinkedListP9 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        System.out.println("Initial List: " + ll);
        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("Love");
        ll2.add("Pancham");
        ll.addAll(1, ll2);
        System.out.println("After insert some elements at the specified position into ll : " + ll);

    }
}
