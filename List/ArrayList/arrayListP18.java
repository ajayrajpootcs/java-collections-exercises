//18. Write a Java program to test whether an array list is empty or not.

import java.util.ArrayList;

public class arrayListP18 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        System.out.println(al);
        System.out.println(al.isEmpty());
        al.removeAll(al);
        System.out.println(al);
        System.out.println(al.isEmpty());

    }
}
