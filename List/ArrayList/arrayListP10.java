// 10. Write a Java program to shuffle elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class arrayListP10 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(4);
        al.add(2);
        al.add(7);

        System.out.println(al);
        Collections.shuffle(al);
        System.out.println(al);
    }
}
