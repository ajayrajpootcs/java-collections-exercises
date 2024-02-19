package Map.TreeMap;

import java.util.TreeMap;

//2. Write a Java program to copy Tree Map's content to another Tree Map.
public class TreeMapP2 {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("Name", "Chandani");
        tm.put("OutFit", "Black");
        tm.put("Figure", "Slim");
        tm.put("Color", "Whitish");
        tm.put("Eye", "Brown");
        System.out.println(tm);
        TreeMap<String, String> tm2 = new TreeMap<>(tm);
        // tm2.putAll(tm);
        System.out.println(tm2);

    }

}
