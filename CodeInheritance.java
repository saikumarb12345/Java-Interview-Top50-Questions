package Java50;

// Write some code to showcase inheritance in Java
public class CodeInheritance {
    public static void main(String[] args) {
        B b = new B();
        b.walk();
        b.eat();
        CodeInheritance c = new CodeInheritance();
        c.run();
        //c.walk();
    }
    public static void run(){
        System.out.println("Running");
    }
    public static void eat(){
        System.out.println("Eating");
    }

}
class B extends CodeInheritance {
    public void walk(){
        System.out.println("Walking");
        super.run();
    }
}
