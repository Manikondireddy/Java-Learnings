package JavaExamples.Wednesday;
interface Payment
{
    void addamount(double amount);
    void withdrawamount(double amount);

}
class Phonepe implements Payment{
    private double balance=0;
    @Override
    public void addamount(double amount)
    {
        balance+= amount;
        System.out.println(balance +"current balance :" + amount);
    }
    @Override
    public void withdrawamount(double amount)
    {
        balance -= amount;
        System.out.println(balance + "current withdraw amount :" + amount);
    }
}

public class Earning {
    public static void main(String[] args) {
        Payment p= new Phonepe();
        p.addamount(2000);
        p.withdrawamount(499999);
            
        };
    }
    

