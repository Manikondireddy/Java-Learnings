package JavaExamples.TUESDAY;

public class MathUtility {
    static int add(int a,int b)
    {
        return a+b;
    }
}
class Mark
{
    public static void main(String[] args)
     {
        int sum= MathUtility.add(200,34);
        int sum1 = MathUtility.add(300,300);
    
        System.out.println("sum of adding 2 numbers :" + sum);
        System.out.println("sum of adding 2 numbers :" + sum1);
    }
}

