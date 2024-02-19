package TreeSet;

//5. Write a Java program to get the first and last elements in a tree set.
import java.util.TreeSet;

public class TreeSetP5 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Yellow");
        ts.add("Pink");
        ts.add("Black");
        ts.add("Blue");
        ts.add("Green");
        System.out.println("FE:" + ts.first());
        System.out.println("LE:" + ts.last());

    }

}
