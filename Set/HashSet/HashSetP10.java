package HashSet;

//10. Write a Java program to compare two hash set.
import java.util.HashSet;

public class HashSetP10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Java");
        hs.add("JavaScript");
        hs.add("React");
        hs.add("Git");
        System.out.println(hs);
        HashSet<String> hs2 = new HashSet<>();
        hs2.add("Java");
        hs2.add("PHP");
        hs2.add("React");
        for (String hset : hs) {
            System.out.println(hs2.contains(hset) ? "Yes" : "No");

        }

    }

}
