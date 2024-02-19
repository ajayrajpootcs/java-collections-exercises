package TreeSet;

import java.util.TreeSet;

//1. Write a Java program to create a tree set, add some colors (strings) and print out the tree set.
public class TreeSetP1 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Yellow");
        ts.add("Pink");
        ts.add("Black");
        ts.add("Blue");
        ts.add("Green");
        System.out.println(ts);

    }

}
