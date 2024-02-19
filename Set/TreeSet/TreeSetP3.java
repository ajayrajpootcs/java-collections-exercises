package TreeSet;

import java.util.TreeSet;

//3. Write a Java program to add all the elements of a specified tree set to another tree set.
public class TreeSetP3 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Yellow");
        ts.add("Pink");
        ts.add("Black");
        ts.add("Blue");
        ts.add("Green");
        System.out.println(ts);
        TreeSet<String> ts2 = new TreeSet<>();
        ts2.add("Orange");
        ts2.add("chocolaty");
        ts2.add("RedOrange");
        ts2.addAll(ts);
        System.out.println(ts2);

    }
}
