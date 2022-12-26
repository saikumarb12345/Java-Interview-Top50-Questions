package Java50;

//Prove that a String object in Java is immutable programmatically
public class StringImmutable {
    public static void main(String[] args) {
        String str = "hello";
        str.replace("l","s");
        System.out.println(str); // hello -> as string is immutable(original string not changed)
    }
}
