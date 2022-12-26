package Java50;

public class TryCatch {
    public static void main(String[] args) {
        int num = 5;
        try{
            System.out.println("Hello");
            System.out.println(num/0);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

}
