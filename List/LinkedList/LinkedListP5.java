package LinkedList;

//5. Write a Java program to insert the specified element at the specified position in the linked list.
import java.util.LinkedList;

public class LinkedListP5 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        ll.add(0, "Lucky");
        System.out.println(ll);

    }

}
