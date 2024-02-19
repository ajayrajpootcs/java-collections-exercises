// 4. Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;

public class arrayListP4 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        // at a specified index 0
        System.out.println(al.get(0));
        // at a specified index 1
        System.out.println(al.get(1));
        // at a specified index 2
        System.out.println(al.get(2));

    }
}
