package Map.HashMap;
//12. Write a Java program to get a collection view of the values contained in this map.

import java.util.HashMap;

public class HashMapP12 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Name", "Chandani");
        hm.put("OutFit", "Black");
        hm.put("Figure", "Slim");
        hm.put("Color", "Whitish");
        hm.put("Eye", "Brown");
        System.out.println(hm.values());
    }

}
