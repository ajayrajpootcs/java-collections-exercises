package LinkedList;

//18. Write a Java program to copy a linked list to another linked list.
// import java.util.Collections;
import java.util.LinkedList;

public class LinkedListP18 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        System.out.println("O-LinkedList: " + ll);

        System.out.println("Coping List1 in List 2");
        // Collections.copy(ll2, ll); will not work with empty Linkedlist
        LinkedList<String> ll2 = (LinkedList) ll.clone();

        System.out.println(ll2);

    }

}
