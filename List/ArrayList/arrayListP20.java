//20. Write a Java program to increase an array list size.

import java.util.ArrayList;

public class arrayListP20 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        System.out.println(al);
        al.ensureCapacity(6);
        al.add("Pink");
        al.add("Chocolate");

    }
}
