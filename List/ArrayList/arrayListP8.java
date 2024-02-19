//8. Write a Java program to sort a given array list.

import java.util.ArrayList;

public class arrayListP8 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        System.out.println(al);
        al.sort(null);
        System.out.println(al);

    }
}
