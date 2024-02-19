package Map.HashMap;

import java.util.HashMap;

//10. Write a Java program to get the value of a specified key in a map.
public class HashMapP10 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Name", "Chandani");
        hm.put("OutFit", "Black");
        hm.put("Figure", "Slim");
        hm.put("Color", "Whitish");
        hm.put("Eye", "Brown");
        System.out.println(hm);
        System.out.println(hm.get("Figure"));
        // System.out.println(hm.("Black"));

    }
}
