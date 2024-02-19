
// 11. Write a Java program to reverse elements in an array list.
import java.util.ArrayList;
import java.util.Collections;

public class arrayListP11 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);
    }
}
