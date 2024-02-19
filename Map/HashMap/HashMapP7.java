package Map.HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//7. Write a Java program to test if a map contains a mapping for the specified key.
public class HashMapP7 {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Name", "Chandani");
        hm.put("OutFit", "Black");
        hm.put("Figure", "Slim");
        hm.put("Color", "Whitish");
        hm.put("Eye", "Brown");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // var key = "Name";
        System.out.println("enter key: ");
        String key = br.readLine();

        if (hm.containsKey(key)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
