package JavaExamples.Wednesday;
interface Payment{
    void AddAmount(double amount);
    void WithdrawAmount(double amount);
}
class Phonepe22 implements Payment{
    private double balance=0;
    @Override
    public void AddAmount(double amount)
    {
        balance+=amount;
        System.out.println(balance +"current adding amount :" + amount);
    }
    @Override
    public void WithdrawAmount(double amount)
    {
        balance -=amount;
        System.out.println(balance +"  current withdrawamount :" + amount );
    }
public static void main(String[] args) {
        Phonepe22 n= new Phonepe22();
        n.AddAmount(20000);
        n.WithdrawAmount(290000);

}
        
   
    }   