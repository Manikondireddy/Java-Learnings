package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops.JavaMethods;

public class MethodCaller {
    public void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println("Sum: " + result);
        MethodCaller caller = new MethodCaller();
        caller.greetUser("Meera");
        int anotherResult = caller.add(30, 40);
        System.out.println("Another Sum: " + anotherResult);
    }
}
    
