package Java50;

import java.util.ArrayList;
import java.util.List;

// Merge two lists in Java
public class MergeLists {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        List<String> list2 = new ArrayList<>();
        list2.add("5");
        list2.add("6");

        List<String> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        System.out.println(mergedList);
    }
}
