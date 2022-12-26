package Java50;

public class PalindromeCheckNumber {
    public static void main(String[] args) {
        int input = 121;
        System.out.println(checkPalindrome(input));
    }
    /*
    palindrome number is one whose reverse is also the same,
    So we can reverse the input  and check if both numbers are equal or not.
     */
    public static boolean checkPalindrome(int input){
        if (input == reverse(input)) {
            return true;
        }
        return false;
    }
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
