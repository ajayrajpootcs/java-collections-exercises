package TreeSet;

//12. Write a Java program to get the element in a tree set strictly greater than or equal to the given element.
import java.util.TreeSet;

public class TreeSetP12 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(6);
        ts.add(8);
        ts.add(4);
        ts.add(11);
        System.out.println(ts.higher(8));
    }

}
