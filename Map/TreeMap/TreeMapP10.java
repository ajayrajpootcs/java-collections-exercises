package Map.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

//10. Write a Java program to get a reverse order view of the keys contained in a given map.
public class TreeMapP10 {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>(Comparator.reverseOrder());
        tm.put("Name", "Chandani");
        tm.put("OutFit", "Black");
        tm.put("Figure", "Slim");
        tm.put("Color", "Whitish");
        tm.put("Eye", "Brown");
        System.out.println(tm);

    }
}
