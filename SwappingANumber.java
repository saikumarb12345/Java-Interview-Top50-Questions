package Java50;

public class SwappingANumber {
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 3;
        System.out.println("SWAPPING WITHOUT THIRD VARIABLE");
        // SWAPPING WITHOUT THIRD VARIABLE
        System.out.println("Before Swapping numbers are " + number1 + " and " + number2);
        number1 = number1 + number2; // number1=2,number2=3 --> 2+3=5
        number2 = number1 - number2; // 5-3=2; number2=2
        number1 = number1 - number2; // 5-2=3; number1=3

        System.out.println("After Swapping numbers are " + number1 + " and " + number2);
        System.out.println();
        int number3 = 5;
        int number4 = 6;
        System.out.println("SWAPPING WITH THIRD VARIABLE");
        // SWAPPING WITH THIRD VARIABLE
        System.out.println("Before Swapping numbers are " + number3 + " and " + number4);
        int temp = number3;
        number3 = number4;
        number4 = temp;
        System.out.println("After Swapping numbers are " + number3 + " and " + number4);
    }
}
