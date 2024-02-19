package Map.HashMap;

import java.util.HashMap;

//4. Write a Java program to remove all mappings from a map.
public class HashMapP4 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Name", "Chandani");
        hm.put("OutFit", "Black");
        hm.put("Figure", "Slim");
        hm.put("Color", "Whitish");
        hm.put("Eye", "Brown");
        System.out.println(hm);
        hm.clear();
        System.out.println(hm);

    }
}
