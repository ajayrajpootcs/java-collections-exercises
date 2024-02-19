package TreeSet;

//11. Write a Java program to get the element in a tree set less than or equal to the given element.
import java.util.TreeSet;

public class TreeSetP11 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(6);
        ts.add(8);
        ts.add(4);
        ts.add(11);
        ts.add(40);
        ts.add(45);
        ts.add(50);

        System.out.println(ts.headSet(7));
        System.out.println(ts.floor(44)); // Return previous nearest element
        System.out.println(ts.higher(40)); // Return next heigher value
        System.out.println(ts.lower(40)); // Return previous nearest element
    }

}
