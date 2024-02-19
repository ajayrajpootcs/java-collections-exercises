package HashSet;

import java.util.HashSet;

//7. Write a Java program to convert a hash set to an array.
public class HashSetP7 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Java");
        hs.add("JavaScript");
        hs.add("React");
        hs.add("Git");
        System.out.println(hs);
        String arr[] = new String[hs.size()];
        // convert a hash set to an array.
        hs.toArray(arr);
        for (String string : arr) {
            System.out.println("[" + string + "," + "]");
        }
    }

}
