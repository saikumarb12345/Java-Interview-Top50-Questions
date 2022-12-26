package Java50;

import java.util.ArrayList;
import java.util.List;

//check if a list of integers contains only odd numbers in Java.
public class OnlyOddInList {
    public static boolean only_Odd(List<Integer> list){
        for(int i : list){
            if(i % 2 == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        System.out.println(only_Odd(list));

    }
}
