package Map.TreeMap;

import java.util.TreeMap;

//12. Write a Java program to get the greatest key less than or equal to the given key.
public class TreeMapP12 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(10, "Red");
        tm.put(20, "Green");
        tm.put(25, "Dark");
        tm.put(40, "Black");
        tm.put(50, "White");
        tm.put(60, "Pink");
        System.out.println(tm);
        System.out.println(tm.floorEntry(30));
        System.out.println(tm.floorKey(50));

    }
}
