//9. Write a Java program to copy one array list into another.

import java.util.ArrayList;
import java.util.Collections;

public class arrayListP9 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        System.out.println(al);
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("1");
        al2.add("4");
        al2.add("3");
        al2.add("0");
        System.out.println(al2);
        // Copying al into al2
        // Collections.copy(al2, al);
        // System.out.println(al2);
        // Copying al2 into al
        Collections.copy(al, al2);
        System.out.println(al);

    }
}
