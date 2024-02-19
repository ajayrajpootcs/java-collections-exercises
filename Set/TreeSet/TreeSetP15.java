package TreeSet;

//15. Write a Java program to retrieve and remove the last element of a tree set.
import java.util.TreeSet;

public class TreeSetP15 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(6);
        ts.add(8);
        ts.add(4);
        ts.add(11);
        System.out.println(ts);
        ts.pollLast();
        System.out.println(ts);
    }

}
