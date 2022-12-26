package Java50;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {2,5,3,7};
        int sum = 0;
        for(int i : arr){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
