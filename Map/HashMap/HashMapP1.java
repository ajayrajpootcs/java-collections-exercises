package Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//1. Write a Java program to associate the specified value with the specified key in a HashMap.
public class HashMapP1 {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
        hm.put("Name", "Chandani");
        hm.put("OutFit", "Black");
        hm.put("Figure", "Slim");
        hm.put("Color", "Whitish");
        hm.put("Eye", "Brown");
        System.out.println(hm.get("Eye"));
        System.out.println(hm);

        for (Map.Entry x : hm.entrySet()) {
            System.out.println(x.getKey() + "->" + x.getValue());
            System.out.println(x.hashCode());
            // System.out.println(x.setValue("Riya"));
            System.out.println(x.hashCode());

        }
        // Set<Entry<String, String>> ts = hm.entrySet();
        TreeMap<String, String> ts = new TreeMap<>(hm);
        System.out.println(ts);
    }
}
