package TreeSet;

//14. Write a Java program to retrieve and remove the first element of a tree set.
import java.util.TreeSet;

public class TreeSetP14 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(6);
        ts.add(8);
        ts.add(4);
        ts.add(11);
        System.out.println(ts.pollFirst());
        System.out.println(ts);
    }

}
