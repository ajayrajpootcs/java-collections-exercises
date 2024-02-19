package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

//4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
public class TreeSetP4 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Yellow");
        ts.add("Pink");
        ts.add("Black");
        ts.add("Blue");
        ts.add("Green");
        Iterator<String> itr = ts.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }

}
