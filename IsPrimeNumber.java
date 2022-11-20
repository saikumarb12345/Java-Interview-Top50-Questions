package Java50;
import java.util.*;
public class IsPrimeNumber {
    public static void main(String[] args) {
        // Check if number is a Prime or not.
        //int num = 7;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num =  sc.nextInt();
        int temp=0;
        for(int i=2;i<num/2;i++){
            if(num % i == 0){
                temp++;
            }
        }
        if(temp>0){
            System.out.println(num + " is not Prime number");
        }
        else {
            System.out.println(num + " is a Prime number");
        }

       // System.out.println(isPrime(num));

    }
    public static boolean isPrime(int num){
        if(num == 0 || num == 1){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }


}
