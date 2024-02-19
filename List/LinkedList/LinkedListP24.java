package LinkedList;

//24. Write a Java program to compare two linked lists.
import java.util.LinkedList;

public class LinkedListP24 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("Noor");
        ll2.add("Adiraj");
        ll2.add("harry");
        ll2.add("Nick");

        for (String list : ll) {
            System.out.println(ll2.contains(list) ? "Yes" : "No");

        }

    }

}
