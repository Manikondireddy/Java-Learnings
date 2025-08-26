package JavaExamples;
interface InterfaceA {
    void method1();
    void method2();
    void method3();
    default void defaultMethod() {
        System.out.println("Default method ");
    }
}
interface InterfaceB extends InterfaceA {
    void method4(); 
}
class C implements InterfaceB {
   @Override
    public void method1() {
        System.out.println("Implementation of method1 in Class C");
    }
@Override
    public void method2() {
        System.out.println("Implementation of method2 in Class C");
    }

    @Override
    public void method3() {
        System.out.println("Implementation of method3 in Class C");
    }
    @Override
    public void method4() {
        System.out.println("Implementation of method4 in Class C");
    }
}
public class InterfaceDemo {
    public static void main(String[] args)
     {
        C obj = new C();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.defaultMethod();
     }
    }



 


     
        


        
    

    

