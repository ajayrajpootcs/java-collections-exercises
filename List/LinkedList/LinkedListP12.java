package LinkedList;

//12. Write a Java program to remove a specified element from a linked list.
import java.util.LinkedList;

public class LinkedListP12 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        System.out.println("Original List :" + ll);
        ll.remove(2);
        System.out.println("After removing a specified element from ll :" + ll);

    }
}
