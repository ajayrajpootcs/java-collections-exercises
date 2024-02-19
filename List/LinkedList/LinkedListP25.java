package LinkedList;

//25. Write a Java program to check if a linked list is empty or not.
import java.util.LinkedList;

public class LinkedListP25 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        System.out.println(ll.isEmpty());
        ll.clear();
        System.out.println(ll.isEmpty());
    }
}
