package Map.TreeMap;

import java.util.TreeMap;
//15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.

public class TreeMapP15 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(10, "Red");
        tm.put(20, "Green");
        tm.put(25, "Dark");
        tm.put(40, "Black");
        tm.put(50, "White");
        tm.put(60, "Pink");
        System.out.println(tm.higherEntry(10));
        System.out.println(tm.higherEntry(30));
        System.out.println(tm.higherEntry(70));
    }

}
