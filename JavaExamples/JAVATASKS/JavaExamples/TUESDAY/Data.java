package JavaExamples.TUESDAY;
interface phonepe
{
    void AddAmount(double amount);
    void WithdrawAmount(double amount);
}
class Car implements phonepe{
    public double balance=0;
    @Override
    public void AddAmount(double amount)
    {
        balance+=amount;
        System.out.println(amount+ "adding Current Amount :" + balance) ;
    }
    @Override
    public void WithdrawAmount(double amount)
    {
        if(amount<=balance)
        {
            balance-=amount;
            System.out.println(amount +"current withdrawing amount :" + balance);
        }
        else{
            System.out.println(amount + "not found in the list: " + balance);
        }
    }

}


public class Data {
    public static void main(String[] args) {
       Car o= new Car();
       o.AddAmount(20000);
       o.WithdrawAmount(40000);
       o.WithdrawAmount(390000);
    }
    
}
