//22. Write a Java program to print all the elements of an ArrayList using the elements' position.

import java.util.ArrayList;

public class arrayListP22 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        for (Integer i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

    }
}
