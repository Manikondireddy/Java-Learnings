package JavaExamples;

public class Amazon
{
    static void buy(int qty)
    {
        System.out.println("buy by qty");
    }
    static void buy(String prdname)
    {
        System.out.println("buy by product name");
    }
    static void buy(int qty, String performance)
    {
        System.out.println("buy by qty,prd name");
    }
    static void buy(String prdname,int qty)
    {
        System.out.println("buy by prdname,qty");
    }
}
class Animations
{
    public static void main(String[] args) 
    {
        Amazon.buy(8);
        Amazon.buy("nike");
        Amazon.buy(6,"puma");
        Amazon.buy("nike",8);
        
    }
} 
