package Java50;

public class ReverseAString {
    public static void main(String[] args) {
        String input  = "Hello";  // olleh
        System.out.println(reverseString(input));
    }
    public static String reverseString(String input){
        // Check for null condition (When the input is null)
        if(input == null){
            System.out.println("String has no Value");
        }
        StringBuilder str = new StringBuilder();
        // Create character array from String
        char[] ch = input.toCharArray();

        for(int i = ch.length - 1; i >= 0; i--){
            str.append(ch[i]+" ");
        }
        return str.toString();
    }
}
