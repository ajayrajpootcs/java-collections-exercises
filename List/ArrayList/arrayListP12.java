//12. Write a Java program to extract a portion of an array list.

import java.util.ArrayList;
import java.util.List;

public class arrayListP12 {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        System.out.println(al);
        List<String> sub_List = al.subList(0, 3);
        System.out.println(sub_List);

    }
}
