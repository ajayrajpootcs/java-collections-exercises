package Map.TreeMap;

import java.util.TreeMap;

//11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
public class TreeMapP11 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(10, "Red");
        tm.put(20, "Green");
        tm.put(25, "Dark");
        tm.put(40, "Black");
        tm.put(50, "White");
        tm.put(60, "Pink");

        System.out.println("Orginal TreeMap content: " + tm);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Value is: " + tm.floorEntry(10));
        System.out.println("Checking the entry for 30: ");
        System.out.println("Value is: " + tm.floorEntry(30));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Value is: " + tm.floorEntry(70));

    }
}
