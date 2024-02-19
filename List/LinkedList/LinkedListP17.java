package LinkedList;

// 17. Write a Java program to join two linked lists.
import java.util.LinkedList;

public class LinkedListP17 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        System.out.println("O-LinkedList: " + ll);
        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("Mayank");
        ll2.add("Roshni");
        ll2.add("Chanda");
        System.out.println("O-LinkedList2: " + ll2);
        ll.addAll(ll2);
        System.out.println("After Joining List2 in List1: " + ll);

    }

}
