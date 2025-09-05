package JavaExamples;

public class MethodwithParameters 
    {
public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        MethodwithParameters obj = new MethodwithParameters();
        int result = obj.add(10, 20);

        System.out.println("Sum: " + result);
    }
}
    
    
