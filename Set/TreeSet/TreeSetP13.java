package TreeSet;

// 13. Write a Java program to get an element in a tree set that has a lower value than the given element.
import java.util.TreeSet;

public class TreeSetP13 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(6);
        ts.add(8);
        ts.add(4);
        ts.add(11);
        System.out.println(ts.lower(11));
    }
}
