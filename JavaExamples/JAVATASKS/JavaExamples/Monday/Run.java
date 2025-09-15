package JavaExamples.Monday;
interface payment
{
     void AddAmount(double amount);
     void WithdrawAmount( double amount);
}
class Phonepe implements payment{
    double balance=0;
    @Override
    public void AddAmount(double amount){
    balance=balance+ amount;
    
        System.out.println(amount +"adding current balance :" + balance);
    }
    @Override
    public void WithdrawAmount(double amount){
        if(amount<=balance)
        {
            balance=amount-balance;
     System.out.println(amount +"withdraw current balance :" + balance);
    }
    else{
        System.out.println("not enough balance");
    }

}
}

public class Run {
    public static void main(String[] args) {
        Phonepe p= new Phonepe();
        p.AddAmount(20000);
        p.WithdrawAmount(20000);
    }
    
}


