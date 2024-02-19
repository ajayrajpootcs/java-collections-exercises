package HashSet;

// 3. Write a Java program to get the number of elements in a hash set.
import java.util.HashSet;

public class HashSetP3 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Java");
        hs.add("JavaScript");
        hs.add("React");
        hs.add("Git");
        System.out.println(hs);
        System.out.println("No of El :" + hs.size());
    }
}
