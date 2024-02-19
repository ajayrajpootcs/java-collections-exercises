package HashSet;

import java.util.HashSet;

//2. Write a Java program to iterate through all elements in a hash list.
public class HashSetP2 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Java");
        hs.add("JavaScript");
        hs.add("React");
        hs.add("Git");
        System.out.println(hs);
        for (String hashset : hs) {
            System.out.print(" " + hashset);

        }

    }
}
