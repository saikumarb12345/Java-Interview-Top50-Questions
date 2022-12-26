package Java50;

public class BiarySeach {
    public static void main(String[] args) {
        int[] arr = {2,3,4,9,11,13,14};
        int target = 13;
        System.out.println(binarySeach(arr,target));
    }
    public static int binarySeach(int[] arr,int target){
        int start = 0; // start is index
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
             return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
