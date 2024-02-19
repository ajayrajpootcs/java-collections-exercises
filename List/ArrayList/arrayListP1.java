
//1. Write a Java program to create an array list, add some colors (strings) and print out the collection.

import java.util.ArrayList;

public class arrayListP1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        al.add("Yellow");
        al.add("Pink");
        System.out.println(al);

    }
}
