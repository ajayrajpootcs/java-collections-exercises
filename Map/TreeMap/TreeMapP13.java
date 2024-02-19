package Map.TreeMap;

import java.util.TreeMap;

//13. Write a Java program to get the portion of a map whose keys are strictly less than a given key.
public class TreeMapP13 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(10, "Red");
        tm.put(20, "Green");
        tm.put(25, "Dark");
        tm.put(40, "Black");
        tm.put(50, "White");
        tm.put(60, "Pink");
        System.out.println(tm.headMap(30));

    }
}
