package practiceOops;
interface Maths {
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}

public class Static {
    public static void main(String[] args) {
        int sum = Maths.add(10, 5);
        int product = Maths.multiply(10, 5);
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }
}

