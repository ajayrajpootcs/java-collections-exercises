package Map.TreeMap;

import java.util.TreeMap;
import java.util.Map.Entry;

//1. Write a Java program to associate the specified value with the specified key in a Tree Map.
public class TreeMapP1 {

    public static void main(String[] args) {

        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("Name", "Chandani");
        tm.put("OutFit", "Black");
        tm.put("Figure", "Slim");
        tm.put("Color", "Whitish");
        tm.put("Eye", "Brown");
        System.out.println(tm.get("Eye"));
        System.out.println(tm);
        for (Entry<String, String> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());

        }

    }

}
