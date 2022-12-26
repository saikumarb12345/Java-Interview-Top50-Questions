package Java50;

import java.util.HashMap;

public class DistinctCharactersInArray {
    public static void main(String[] args) {
        String str = "abcdABCDabcd";
        HashMap<Character,Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();

        for(char c : ch){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
