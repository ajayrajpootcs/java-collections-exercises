package LinkedList;

//8. Write a Java program to insert the specified element at the end of a linked list.
import java.util.LinkedList;

public class LinkedListP8 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        System.out.println("List: " + ll);
        ll.offerLast("Noor");
        System.out.println("After Adding Specified Element At The end of a ll(Index nth): " + ll);
    }
}
