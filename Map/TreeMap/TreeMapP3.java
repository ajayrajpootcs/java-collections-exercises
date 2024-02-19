package Map.TreeMap;

import java.util.TreeMap;

//3. Write a Java program to search for a key in a Tree Map.
public class TreeMapP3 {
    public static void main(String[] args) {

        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("Name", "Chandani");
        tm.put("OutFit", "Black");
        tm.put("Figure", "Slim");
        tm.put("Color", "Whitish");
        tm.put("Eye", "Brown");
        System.out.println(tm);
        System.out.println(tm.containsKey("OutFit"));

    }
}
