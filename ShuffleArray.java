package Java50;

import java.util.Arrays;
import java.util.Random;

// Shuffle an array in Java
public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Random rand = new Random(); // Random class for to generate random number

        for(int i=0;i<arr.length;i++){
            int randomIndex = rand.nextInt(arr.length);
            int temp = arr[randomIndex];
            arr[randomIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
