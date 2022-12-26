package Java50;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4};
        int fmax = 0;
        int smax = fmax;

        for(int i=0;i<arr.length;i++){
            if(fmax < arr[i]){
                smax = fmax;
                fmax = arr[i];
            }
            else if(arr[i] > smax){
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}
