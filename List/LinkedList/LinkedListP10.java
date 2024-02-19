package LinkedList;

//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
import java.util.LinkedList;

public class LinkedListP10 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        System.out.println("Initial List: " + ll);
        System.out.println("First occurrence: " + ll.getFirst());
        System.out.println("Last Occurrence: " + ll.getLast());

    }
}
