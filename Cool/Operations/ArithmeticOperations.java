package Cool.Operations;
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();;
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num2 != 0 ? num1 / num2 : Double.NaN;
        double modulus = num2 != 0 ? num1 % num2 : Double.NaN;
        System.out.println("\nArithmetic Operations:");
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
        System.out.println("Modulus: " + modulus);

        scanner.close();
    }
}

     

