package TreeSet;

//16. Write a Java program to remove a given element from a tree set.
import java.util.TreeSet;

public class TreeSetP16 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(6);
        ts.add(8);
        ts.add(4);
        ts.add(11);
        ts.remove(2);
        System.out.println(ts);
    }
}
