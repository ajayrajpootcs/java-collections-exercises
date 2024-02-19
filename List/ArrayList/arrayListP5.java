// 5. Write a Java program to update an array element by the given element.

import java.util.ArrayList;

public class arrayListP5 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        System.out.println(al);
        // set Replaces an element in a collection.
        // The set() method adds a new element at the specified position by replacing
        // the older element at that position.
        al.set(3, "Pink");
        System.out.println(al);

    }
}
