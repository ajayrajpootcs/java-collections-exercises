package Map.TreeMap;

import java.util.TreeMap;

//4. Write a Java program to search for a value in a Tree Map.
public class TreeMapP4 {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("Name", "Chandani");
        tm.put("OutFit", "Black");
        tm.put("Figure", "Slim");
        tm.put("Color", "Whitish");
        tm.put("Eye", "Brown");
        System.out.println(tm.containsValue("Black"));
    }
}
