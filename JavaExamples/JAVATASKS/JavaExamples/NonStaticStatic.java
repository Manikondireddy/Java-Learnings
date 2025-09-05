package JavaExamples;
public class NonStaticStatic {
    public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 25;
        NonStaticStatic obj = new NonStaticStatic();
        int result = obj.add(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}

    

