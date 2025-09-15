package JavaExamples.Monday;

public class MathUtilityD {
    static int add(int a,int b)
    {
        return a+b;
    }
}
class MathutilityDemo{
    public static void main(String[] args) {
        int res1= MathUtilityD.add(10,20);
        int res2= MathUtilityD.add(40,30);
        System.out.println("sum of 10 and 20 " + res1);
        System.out.println("sum of 40 and 30 " + res2);

    }

}
