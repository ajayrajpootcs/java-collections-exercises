//16. Write a Java program to clone an array list to another array list.

import java.util.ArrayList;

public class arrayListP16 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        System.out.println(al);
        ArrayList<String> cloned_List = (ArrayList<String>) al.clone();
        System.out.println(cloned_List);

    }
}
