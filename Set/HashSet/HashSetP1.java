package HashSet;

//1. Write a Java program to append the specified element to the end of a hash set.
import java.util.HashSet;

public class HashSetP1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Java");
        hs.add("JavaScript");
        hs.add("React");
        hs.add("Git");
        System.out.println(hs);
    }
}
