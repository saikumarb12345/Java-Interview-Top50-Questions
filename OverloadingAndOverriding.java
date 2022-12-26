package Java50;

// Examples of overloading and overriding in Java
public class OverloadingAndOverriding {
    public static void main(String[] args) {
        OverloadingAndOverriding ol = new OverloadingAndOverriding();
        ol.print("Hello");
        System.out.println();
        ol.print("Hello",3);
        System.out.println();
    }
    void run(){
        System.out.println("Parent running");
    }
    void print(String s){
        System.out.println(s);
    }
    void print(String s,int n){ // Overloading
        while(n > 0){
            System.out.println(s);
            n--;
        }
    }
    class Child extends OverloadingAndOverriding{ //Overriding
        void run(){
            System.out.println("Child running");
        }
    }
}
