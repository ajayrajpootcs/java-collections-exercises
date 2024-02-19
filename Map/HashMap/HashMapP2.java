package Map.HashMap;

import java.util.HashMap;

//2. Write a Java program to count the number of key-value (size) mappings in a map.
public class HashMapP2 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Name", "Chandani");
        hm.put("OutFit", "Black");
        hm.put("Figure", "Slim");
        hm.put("Color", "Whitish");
        hm.put("Eye", "Brown");
        System.out.println(hm);
        System.out.println(hm.size());

    }
}
