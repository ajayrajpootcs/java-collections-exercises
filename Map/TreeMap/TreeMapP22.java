package Map.TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

// 22. Write a Java program to get the portion of a map whose keys range from a given key to another key.
public class TreeMapP22 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(10, "Red");
        tm.put(20, "Green");
        tm.put(25, "Dark");
        tm.put(40, "Black");
        tm.put(50, "White");
        tm.put(60, "Pink");
        SortedMap<Integer, String> submap = tm.subMap(25, true, 50, true);
        System.out.println(submap);
    }

}
