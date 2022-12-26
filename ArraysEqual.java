package Java50;

public class ArraysEqual {
    public static void main(String[] args) {
        int[] a = {10,30,12};
        int[] b = {10,30,12};
        boolean result = true;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                result = false;
            }
            else{
                result = true;
            }
        }
        if(result == true){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}
