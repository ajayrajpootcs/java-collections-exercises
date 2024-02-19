package HashSet;

//4. Write a Java program to empty an hash set.
import java.util.HashSet;

public class HashSetP4 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Java");
        hs.add("JavaScript");
        hs.add("React");
        hs.add("Git");
        System.out.println(hs);
        hs.clear();
        System.out.println(hs);
    }

}
