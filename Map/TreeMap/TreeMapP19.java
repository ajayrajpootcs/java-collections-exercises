package Map.TreeMap;

import java.util.TreeMap;
//19. Write a Java program to remove and get a key-value mapping associated with the least key in a map.

public class TreeMapP19 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(10, "Red");
        tm.put(20, "Green");
        tm.put(25, "Dark");
        tm.put(40, "Black");
        tm.put(50, "White");
        tm.put(60, "Pink");
        System.out.println(tm.pollFirstEntry());
        System.out.println(tm);

    }

}
