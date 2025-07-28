package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops.JavaMethods;

import java.lang.reflect.Method;

public class Returntype {
    public void printGreeting() {
        System.out.println("Hello there!");
    }
    public int getAge() {
        return 25;
    }
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    public String getWelcomeMessage(String name) {
        return "Welcome, " + name + "!";
    }
    public Returntype getNewInstance() {
        return new Returntype();
    }

    public static void main(String[] args) {
        Returntype demo = new Returntype();
        demo.printGreeting();
        int age = demo.getAge();
        System.out.println("Age: " + age);

        boolean evenCheck = demo.isEven(10); 
        System.out.println("Is 10 even? " + evenCheck);

        String message = demo.getWelcomeMessage("Mani");
        System.out.println(message);

        Returntype anotherDemo = demo.getNewInstance(); 
        anotherDemo.printGreeting();
    }
}
    
    

