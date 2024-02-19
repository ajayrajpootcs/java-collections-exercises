package HashSet;

//12. Write a Java program to remove all elements from a hash set.
import java.util.HashSet;

public class HashSetP12 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Java");
        hs.add("JavaScript");
        hs.add("React");
        hs.add("Git");
        System.out.println(hs);
        hs.removeAll(hs);
        System.out.println(hs);
    }
}
