package LinkedList;

//21. Write a Java program to retrieve, but not remove, the last element of a linked list.
import java.util.LinkedList;

public class LinkedListP21 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        System.out.println("O-LinkedList: " + ll);
        System.out.println("retrieve, but not remove, the first element of a linked list.: " + ll.peekLast());
        System.out.println(ll);
    }
}
