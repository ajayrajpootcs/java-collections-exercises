package Map.TreeMap;

import java.util.TreeMap;
//18. Write a Java program to get a NavigableSet view of keys in a map.

public class TreeMapP18 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(10, "Red");
        tm.put(20, "Green");
        tm.put(25, "Dark");
        tm.put(40, "Black");
        tm.put(50, "White");
        tm.put(60, "Pink");

        System.out.println(tm.navigableKeySet());
    }

}
