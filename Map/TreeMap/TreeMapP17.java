package Map.TreeMap;

import java.util.TreeMap;
//17. Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.

public class TreeMapP17 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(10, "Red");
        tm.put(20, "Green");
        tm.put(25, "Dark");
        tm.put(40, "Black");
        tm.put(50, "White");
        tm.put(60, "Pink");
        System.out.println(tm.lowerKey(10));
        System.out.println(tm.lowerKey(60));
    }

}
