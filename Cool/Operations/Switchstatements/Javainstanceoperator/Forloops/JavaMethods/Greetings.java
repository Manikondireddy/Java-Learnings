package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops.JavaMethods;

public class Greetings {
    String language = "Kannda";
    public void sayHello(String name) { 
        String greeting = "Hello";

        System.out.println(greeting + ", " + name + "! Welcome to " + language);
    }

    public static void main(String[] args) {
        Greetings g = new Greetings();
        g.sayHello("Mani");
        g.sayHello("Murali");
    }
}
    

