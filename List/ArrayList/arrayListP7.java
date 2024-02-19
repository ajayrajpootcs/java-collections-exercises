//7. Write a Java program to search for an element in an array list.

import java.util.ArrayList;

public class arrayListP7 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        System.out.println(al.contains("black"));
        System.out.println(al);
        if (al.contains("Green")) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not found");
        }
    }
}
