//15. Write a Java program to join two array lists.

import java.util.ArrayList;
import java.util.Collections;

public class arrayListP15 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Black");
        al2.add("Purple");
        al2.add("Orange");
        al2.add("Sky-Blue");
        al2.addAll(al2);
        System.out.println(al2);
        Collections.addAll(al2, "Blue", "Red");
        System.out.println(al2);

    }
}
