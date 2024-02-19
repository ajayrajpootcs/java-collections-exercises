package Map.TreeMap;

import java.util.TreeMap;

//6. Write a Java program to delete all elements from a Tree Map.

public class TreeMapP6 {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("Name", "Chandani");
        tm.put("OutFit", "Black");
        tm.put("Figure", "Slim");
        tm.put("Color", "Whitish");
        tm.put("Eye", "Brown");
        System.out.println(tm);
        tm.clear();
        System.out.println(tm);
    }

}
