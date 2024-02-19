//3. Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;

public class arrayListP3 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        System.out.println(al);
        // Changing Element at the First Position
        al.add(0, "Pink");
        // Changing Element at the Third Position
        al.add(3, "Purpule");
        System.out.println(al);

        // The add() method adds a new element at the specified position by shifting the
        // older element towards the right position.
    }
}
