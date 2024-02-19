package Map.TreeMap;

import java.util.TreeMap;

//14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
public class TreeMapP14 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(10, "Red");
        tm.put(20, "Green");
        tm.put(25, "Dark");
        tm.put(40, "Black");
        tm.put(50, "White");
        tm.put(60, "Pink");
        // suppose given is 50 we have to print True If given key exactly match to the
        // treeMapKey

        System.out.println(tm.headMap(30, true));

    }
}
