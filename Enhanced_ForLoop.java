package Java50;

import java.util.Arrays;
import java.util.List;

public class Enhanced_ForLoop {
    public static void main(String[] args) {
        String[] names = {"ravi","ram","john"};

        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
//        List<String> list=Arrays.asList(names);
//        for(int i=0,j=list.size();i<j;i++){
//            System.out.println(list.get(i));
//        }
    }
}
