//19. Write a Java program for trimming the capacity of an array list.

import java.util.ArrayList;

public class arrayListP19 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        System.out.println(al);
        al.trimToSize();
        System.out.println(al);

    }
}
