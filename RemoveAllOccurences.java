package Java50;

// Remove all occurrences of a given character from an input string in Java
public class RemoveAllOccurences {
    public static void main(String[] args) {
        String str = "abcdABCDabcdABCD";
        str = str.replace("b","");
        System.out.println(str);
    }
}
