package HashSet;

//8. Write a Java program to convert a hash set to a tree set.
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetP8 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Java");
        hs.add("JavaScript");
        hs.add("React");
        hs.add("Git");
        System.out.println(hs);
        TreeSet<String> ts = new TreeSet<>(hs);
        System.out.println("TS :" + ts);
    }

}
