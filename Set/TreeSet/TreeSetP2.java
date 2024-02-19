package TreeSet;

import java.util.Iterator;
//2. Write a Java program to iterate through all elements in a tree set.
import java.util.TreeSet;

public class TreeSetP2 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Yellow");
        ts.add("Pink");
        ts.add("Black");
        ts.add("Blue");
        ts.add("Green");
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }

}
