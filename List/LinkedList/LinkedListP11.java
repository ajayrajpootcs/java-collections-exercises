package LinkedList;

//11. Write a Java program to display elements and their positions in a linked list.
import java.util.LinkedList;

public class LinkedListP11 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");

        for (int i = 0; i < ll.size(); i++) {
            System.out.println("Element of index " + i + " :" + ll.get(i));

        }

    }

}
