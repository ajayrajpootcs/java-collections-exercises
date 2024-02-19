package Map.HashMap;

import java.util.HashMap;

//8. Write a Java program to test if a map contains a mapping for the specified value.
public class HashMapP8 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Name", "Chandani");
        hm.put("OutFit", "Black");
        hm.put("Figure", "Slim");
        hm.put("Color", "Whitish");
        hm.put("Eye", "Brown");
        System.out.println(hm);
        System.out.println(hm.containsKey("Name"));
        System.out.println(hm.containsValue("Brown"));
    }
}
