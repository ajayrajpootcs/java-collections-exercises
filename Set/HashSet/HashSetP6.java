package HashSet;

//6. Write a Java program to clone a hash set to another hash set.
import java.util.HashSet;

public class HashSetP6 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Java");
        hs.add("JavaScript");
        hs.add("React");
        hs.add("Git");
        System.out.println(hs);
        HashSet<String> hs2 = (HashSet) hs.clone();
        System.out.println("Cloned " + hs2);
    }

}
