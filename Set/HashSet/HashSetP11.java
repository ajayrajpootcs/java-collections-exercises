package HashSet;

import java.util.HashSet;

//11. Write a Java program to compare two sets and retain elements that are the same.
public class HashSetP11 {
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
        System.out.println("HS2: " + hs2);
        hs.retainAll(hs2);
        System.out.println("DUP:" + hs);

    }
}
