package LinkedList;

//6. Write a Java program to insert elements into the linked list at the first and last positions.
import java.util.LinkedList;

public class LinkedListP6 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        System.out.println(ll);
        ll.addFirst("Lucky");
        System.out.println(ll);
        ll.addLast("Rajput");
        System.out.println(ll);

    }
}
