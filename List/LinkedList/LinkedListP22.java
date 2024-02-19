package LinkedList;

//22. Write a Java program to check if a particular element exists in a linked list.
import java.util.LinkedList;

public class LinkedListP22 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        if (ll.contains("Royal")) {
            System.out.println("present in the linked list.");
        } else {
            System.out.println("not present in the linked list.");
        }
    }

}
