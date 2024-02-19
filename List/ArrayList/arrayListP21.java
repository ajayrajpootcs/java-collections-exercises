// 21. Write a Java program to replace the second element of an ArrayList with the specified element.

import java.util.ArrayList;

public class arrayListP21 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        System.out.println(al);
        al.set(1, "OrangeRed");
        System.out.println(al);
    }

}
