package LinkedList;

//7. Write a Java program to insert the specified element at the front of a linked list.
import java.util.LinkedList;

public class LinkedListP7 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        System.out.println("List " + ll);
        ll.offer("Noor");
        System.out.println("Offer " + ll);

        ll.offerFirst("Lucky");
        System.out.println("OfferFirst " + ll);
        ll.offerLast("Niki");
        System.out.println("OfferLast " + ll);

    }
}
