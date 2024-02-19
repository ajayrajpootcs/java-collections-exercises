// 14. Write a Java program that swaps two elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class arrayListP14 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        System.out.println(al);
        Collections.swap(al, 2, 0);
        System.out.println(al);

    }
}
