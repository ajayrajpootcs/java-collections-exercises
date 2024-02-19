package Map.HashMap;

import java.util.HashMap;

//6. Write a Java program to get a shallow copy of a HashMap instance.
public class HashMapP6 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Name", "Chandani");
        hm.put("OutFit", "Black");
        hm.put("Figure", "Slim");
        hm.put("Color", "Whitish");
        hm.put("Eye", "Brown");
        System.out.println(hm);
        HashMap<String, String> newHM = new HashMap<>();
        newHM = (HashMap<String, String>) hm.clone();
        System.out.println(newHM);

    }
}
