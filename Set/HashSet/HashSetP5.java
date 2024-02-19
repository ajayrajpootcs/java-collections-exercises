package HashSet;

// 5. Write a Java program to test if a hash set is empty or not.
import java.util.HashSet;

public class HashSetP5 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Java");
        hs.add("JavaScript");
        hs.add("React");
        hs.add("Git");
        System.out.println(hs);
        System.out.println(hs.isEmpty() ? "Empty" : "Not Emptty");
        hs.removeAll(hs);
        System.out.println(hs.isEmpty() ? "Empty" : "Not Emptty");
    }

}
