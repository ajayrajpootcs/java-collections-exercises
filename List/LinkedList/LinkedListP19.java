package LinkedList;

//19. Write a Java program to remove and return the first element of a linked list.
import java.util.LinkedList;

public class LinkedListP19 {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        System.out.println("O-LinkedList: " + ll);
        Object removedEl = ll.removeFirst();
        System.out.println("Removing First element :" + ll);
        System.out.println("Printing Removed First element :" + removedEl);
        // or
        // System.out.println("Removing First element :" + ll.pop());
        // System.out.println("Printing Removed First element :" + ll);
    }

}
