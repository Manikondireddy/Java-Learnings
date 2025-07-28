package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops.JavaMethods;

public class methods {
    public void printWelcome() {
        System.out.println("Welcome to fission labs");
    }
    public void addAndPrint(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
    public int multiply(int a, int b) {
        return a * b;
    }

    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }
    public static void main(String[] args) {
        methods calc = new methods();
        calc.printWelcome();
        calc.addAndPrint(10, 20);
        int product = calc.multiply(5, 6);
        System.out.println("Product: " + product);
        double root = methods.squareRoot(144);
        System.out.println("Square Root: " + root);
    }
}
    

