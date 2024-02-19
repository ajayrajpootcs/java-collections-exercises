package TreeSet;

//6. Write a Java program to clone a tree set list to another tree set.
import java.util.TreeSet;

public class TreeSetP6 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Yellow");
        ts.add("Pink");
        ts.add("Black");
        ts.add("Blue");
        ts.add("Green");
        System.out.println(ts);
        TreeSet<String> tsClone = (TreeSet<String>) ts.clone();
        System.out.println("Cloned :" + tsClone);

    }

}
