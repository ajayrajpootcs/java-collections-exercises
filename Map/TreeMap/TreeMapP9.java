package Map.TreeMap;

import java.util.TreeMap;

//9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
public class TreeMapP9 {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("Name", "Chandani");
        tm.put("OutFit", "Black");
        tm.put("Figure", "Slim");
        tm.put("Color", "Whitish");
        tm.put("Eye", "Brown");
        System.out.println(tm);
        System.out.println(tm.firstKey());
        System.out.println(tm.lastKey());

    }
}
