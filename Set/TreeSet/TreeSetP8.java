package TreeSet;

//8. Write a Java program to compare two tree sets.
import java.util.TreeSet;

public class TreeSetP8 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Yellow");
        ts.add("Pink");
        ts.add("Black");
        ts.add("Blue");
        ts.add("Green");
        System.out.println(ts);
        TreeSet<String> ts2 = new TreeSet<>();
        ts2.add("Orange");
        ts2.add("chocolaty");
        ts2.add("RedOrange");
        ts2.addAll(ts);
        System.out.println(ts2);
        for (String tsel : ts2) {
            System.out.println(ts.contains(tsel) ? "Yes" : "No");

        }

    }

}
