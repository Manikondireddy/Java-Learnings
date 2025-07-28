package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops;

public class Nestedclass {
    String greeting = "Hello";
    class Nested {
        void showMessage() {
            System.out.println("Hello hi");
        }
    }
    public static void main(String[] args) {
        Nestedclass outer = new Nestedclass();
        Nestedclass.Nested nested = outer.new Nested();
        System.out.println(outer.greeting);
        nested.showMessage();
    }
}
    

