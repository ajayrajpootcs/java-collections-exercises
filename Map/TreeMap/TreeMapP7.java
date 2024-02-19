package Map.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

// 7. Write a Java program to sort keys in a Tree Map by using a comparator.

public class TreeMapP7 {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>(new sort_key());
        tm.put("Name", "Chandani");
        tm.put("OutFit", "Black");
        tm.put("Figure", "Slim");
        tm.put("Color", "Whitish");
        tm.put("Eye", "Brown");
        System.out.println(tm);
    }

}

class sort_key implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}