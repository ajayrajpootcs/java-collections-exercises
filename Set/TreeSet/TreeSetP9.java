package TreeSet;

import java.util.Iterator;
//9. Write a Java program to find numbers less than 7 in a tree set.
import java.util.TreeSet;

public class TreeSetP9 {
    public static void main(String[] args) {
        TreeSet<Integer> hs = new TreeSet<>();
        hs.add(1);
        hs.add(3);
        hs.add(2);
        hs.add(6);
        hs.add(8);
        hs.add(4);
        hs.add(11);

        System.out.println(hs);
        Iterator<Integer> itr = hs.iterator();
        while (itr.hasNext()) {
            Integer el = itr.next();
            if (el < 7) {
                System.out.print(el + ",");

            }

        }

    }

}
