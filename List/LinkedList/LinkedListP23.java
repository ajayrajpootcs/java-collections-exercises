package LinkedList;

import java.util.ArrayList;

// 23. Write a Java program to convert a linked list to an array list.

import java.util.LinkedList;

public class LinkedListP23 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nick");
        ll.add("Adiraj");
        ll.add("Anupam");
        ll.add("Abhishek");
        ll.add("Bittoo");
        ll.add("Royal");
        ArrayList<String> al = new ArrayList<>(ll);
        System.out.println(al);

    }

}
