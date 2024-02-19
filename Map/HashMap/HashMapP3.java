package Map.HashMap;

import java.util.Collections;
import java.util.HashMap;

//3. Write a Java program to copy all mappings from the specified map to another map.
public class HashMapP3 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Name", "Chandani");
        hm.put("OutFit", "Black");
        hm.put("Figure", "Slim");
        hm.put("Color", "Whitish");
        hm.put("Eye", "Brown");

        System.out.println(hm);
        HashMap<String, String> hm2 = new HashMap<>(hm);
        // hm2.putAll(hm);
        System.out.println(hm2);

    }
}
