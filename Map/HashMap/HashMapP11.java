package Map.HashMap;

// import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

//11. Write a Java program to get a set view of the keys contained in this map.
public class HashMapP11 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Name", "Chandani");
        hm.put("OutFit", "Black");
        hm.put("Figure", "Slim");
        hm.put("Color", "Whitish");
        hm.put("Eye", "Brown");
        System.out.println(hm);

        Set<String> set = hm.keySet();

        System.out.println(set);

    }
}
