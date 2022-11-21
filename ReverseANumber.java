package Java50;

public class ReverseANumber {
    public static void main(String[] args) {
        int input = 473; // ANS = 374
        System.out.println("Reverse number of " + input + " is "+reverse(input));
    }
    // Reverse Method
    public static int reverse(int input){
        int rev = 0;
        int rem;  // rem == Remainder of Number
        while(input > 0){
            rem = input % 10;
            /*
            Multiplication by 10 adds a new place in the reversed number.
            One'th place multiplied by 10 gives you tenth place,
            ten'th gives you hundredth, and so on.
             */
            rev = rev * 10 + rem;
            input = input / 10;
        }
        return rev;
    }
}
