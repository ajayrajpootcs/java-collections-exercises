//6. Write a Java program to remove the third element from an array list.

import java.util.ArrayList;
import java.util.function.Predicate;

public class arrayListP6 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        al.remove("Red");
        System.out.println(al);
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(1);
        al2.add(2);
        al2.add(7);
        al2.add(3);
        Predicate<Integer> pr = a -> (a % 2 == 0);
        al2.removeIf(pr);
        System.out.println(al2);

    }
}
