package Map.TreeMap;

import java.util.Set;
import java.util.TreeMap;
//5. Write a Java program to get all keys from a Tree Map.

public class TreeMapP5 {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("Name", "Chandani");
        tm.put("OutFit", "Black");
        tm.put("Figure", "Slim");
        tm.put("Color", "Whitish");
        tm.put("Eye", "Brown");
        System.out.println(tm);

        Set<String> Set = tm.keySet();
        System.out.println(Set);

    }

}
