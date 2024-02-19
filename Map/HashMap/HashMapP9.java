package Map.HashMap;

import java.util.HashMap;

//9. Write a Java program to create a set view of the mappings contained in a map.
public class HashMapP9 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Name", "Chandani");
        hm.put("OutFit", "Black");
        hm.put("Figure", "Slim");
        hm.put("Color", "Whitish");
        hm.put("Eye", "Brown");
        System.out.println(hm);
        hm.entrySet();
        System.out.println(hm);

    }
}
