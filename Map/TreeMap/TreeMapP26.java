package Map.TreeMap;

import java.util.TreeMap;

//26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
public class TreeMapP26 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(10, "Red");
        tm.put(20, "Green");
        tm.put(25, "Dark");
        tm.put(40, "Black");
        tm.put(50, "White");
        tm.put(60, "Pink");
        System.out.println(tm.ceilingKey(35));
    }

}
