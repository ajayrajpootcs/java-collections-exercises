// 17. Write a Java program to empty an array list.

import java.util.ArrayList;

public class arrayListP17 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        System.out.println(al);
        // it will remove all Elements From from al(ArrayList)
        al.clear();
        System.out.println(al);
        // or To remove Specific arrayList's Element From Given arrayList(al)
        al.removeAll(al);

    }
}
