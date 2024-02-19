package LinkedList;

// 14. Write a Java program to remove all elements from a linked list.
import java.util.LinkedList;

public class LinkedListP14 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        System.out.println("O-LinkedList: " + ll);
        ll.removeAll(ll);
        // or
        // ll.clear();
        System.out.println("After Remove All: " + ll);

    }

}
