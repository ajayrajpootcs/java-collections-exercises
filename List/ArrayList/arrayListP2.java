// 2. Write a Java program to iterate through all elements in an array list.

import java.util.ArrayList;

import java.util.Iterator;

public class arrayListP2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        al.add("Yellow");
        al.add("Pink");

        // Using for-each loop
        for (String list : al) {
            System.err.print(" " + list);
        }
        System.out.println();
        // Using Iterator
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());

        }
    }
}
