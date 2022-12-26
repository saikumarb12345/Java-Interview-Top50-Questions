package Java50;

//Factorial of an integer in Java?
public class FactorialOfNUmber {
    public static void main(String[] args) {
        int fact = 5; // 120
        int fact2 = 6; // 720
        System.out.println(factorial1(fact));
        System.out.println(factRecursive(fact2));

    }
    public static int factorial1(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
       return fact;
    }
    public static int factRecursive(int n){
        if(n<=1){
            return 1;
        }
        return n * factRecursive(n-1);
    }
}
