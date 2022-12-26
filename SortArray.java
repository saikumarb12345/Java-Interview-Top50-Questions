package Java50;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {2,-1,5,3,9,1,0};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp;
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+" ");
        }

//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr); //o(n log(n))
//        System.out.println(Arrays.toString(arr));

    }
}
