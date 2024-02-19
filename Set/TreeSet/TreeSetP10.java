package TreeSet;

import java.util.Iterator;
// 10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
import java.util.TreeSet;

public class TreeSetP10 {
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
        Integer GivenElement = 4; // or use Scanner
        Iterator<Integer> itr = ts.iterator();
        while (itr.hasNext()) {
            Integer el = itr.next();
            if (el >= GivenElement) {
                System.out.print(el + ",");

            }

        }
        // OR
        // System.out.println(ts.ceiling(3));

    }
}
