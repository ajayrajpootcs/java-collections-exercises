package LinkedList;

//26. Write a Java program to replace an element in a linked list.
import java.util.LinkedList;

public class LinkedListP26 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        System.out.println(ll);
        ll.set(2, "Kiara");
        System.out.println(ll);
    }
}
