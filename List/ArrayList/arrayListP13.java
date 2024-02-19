//13. Write a Java program to compare two array lists.

import java.util.ArrayList;

public class arrayListP13 {
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

        ArrayList<String> al3 = new ArrayList<>();

        for (String element : al) {
            al3.add(al2.contains(element) ? "Yes" : "No");
        }
        System.out.println(al3);

    }
}
