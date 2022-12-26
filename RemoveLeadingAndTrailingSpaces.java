package Java50;

public class RemoveLeadingAndTrailingSpaces {
    public static void main(String[] args) {
        String str = "    hello world  ";
        System.out.println(str);
        str = str.trim();
        System.out.println(str);
    }
}
