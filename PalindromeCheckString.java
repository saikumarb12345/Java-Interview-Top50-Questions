package Java50;

public class PalindromeCheckString {
    public static void main(String[] args) {
        System.out.println(checkPalin("radar"));
        System.out.println(checkPalin2("121"));

    }
    public static boolean checkPalin(String str){
        int length = str.length();
        boolean result = true;
        for(int i=0;i<length/2;i++){
            if(str.charAt(i) != str.charAt(length-i-1)){
                result = false;
                break;
            }
        }
        return result;
    }
    public static boolean checkPalin2(String str){
        String myString = str;
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        if(myString.equals(rev)){
            return true;
        }
        return false;
    }
}
