package Map.TreeMap;

import java.util.TreeMap;

//8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.

public class TreeMapP8 {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("Name", "Chandani");
        tm.put("OutFit", "Black");
        tm.put("Figure", "Slim");
        tm.put("Color", "Whitish");
        tm.put("Eye", "Brown");
        System.out.println(tm);
        System.out.println(tm.firstEntry());
        System.out.println(tm.lastEntry());
        System.out.println(tm.firstKey());
        System.out.println(tm.lastKey());
    }

}
