package Java50;

import java.util.Stack;

public class Fibonacci {
    public static void main(String[] args) {
        // Print Fibonacci Series
        int num=4;
       // System.out.println(fib(num));
        int a=0;
        int b=1;
        int c;
        int n=7;
        int i=1;
        while(i<=n){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            i++;
        }
    }
    // recursion method
    public static int fib(int num){
        if(num<=1){
            return num;
        }
        return fib(num-1)+fib(num-2);
    }
}
