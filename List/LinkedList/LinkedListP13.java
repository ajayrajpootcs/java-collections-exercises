package LinkedList;

import java.util.LinkedList;

//12. Write a Java program to remove a specified element from a linked list.
public class LinkedListP13 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");

        System.out.println("Original List :" + ll);
        ll.removeFirst();
        System.out.println("After Removing First element :" + ll);
        ll.removeLast();
        System.out.println("After Removing Last element :" + ll);

        Object el = ll.remove(2);
        System.out.println("Element Removed :" + el);
        System.out.println(ll);

    }
}
