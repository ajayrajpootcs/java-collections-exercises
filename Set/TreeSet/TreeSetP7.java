package TreeSet;

//7. Write a Java program to get the number of elements in a tree set.
import java.util.TreeSet;

public class TreeSetP7 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Yellow");
        ts.add("Pink");
        ts.add("Black");
        ts.add("Blue");
        ts.add("Green");
        System.out.println(ts);
        System.out.println("Size:" + ts.size());

    }

}
