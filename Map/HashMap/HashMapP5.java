package Map.HashMap;

import java.util.HashMap;

//5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
public class HashMapP5 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Name", "Chandani");
        hm.put("OutFit", "Black");
        hm.put("Figure", "Slim");
        hm.put("Color", "Whitish");
        hm.put("Eye", "Brown");
        System.out.println(hm);
        boolean isEmpty = hm.isEmpty();
        System.out.println(isEmpty);
    }

}
