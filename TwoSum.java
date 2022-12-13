package Java50;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,9,11};
        int target = 11;
        int[] result = twoSum(arr,target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] arr,int target){
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(target-arr[i])){
                result[0] = map.get(target - arr[i]);
                result[1] = i;
                return result;
            }
            map.put(arr[i],i);
        }
        return result;
    }
}
