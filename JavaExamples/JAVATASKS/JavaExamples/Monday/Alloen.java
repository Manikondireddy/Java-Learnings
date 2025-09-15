package JavaExamples.Monday;

interface payment{
    void addamount(double amount);
    void withdrawamount(double amount);
}
class Phonepe implements payment{
    double balance=0;
    @Override
    public void addamount(double amount)
    {
        balance=balance+ amount;
        System.out.println(amount + "Adding current balance :"+ balance);
        
    }
    @Override
    public void withdrawamount(double amount)
    {
        if(amount<=balance)
        {
            balance=balance-amount;
            System.out.println(amount  + "withdraw current balance :"+ balance);
        }
        else{
            System.out.println("not enough amount");
        }
    }
}

public class Alloen {
    public static void main(String[] args) {
        Phonepe m= new Phonepe();
        m.addamount(400.00);
        m.withdrawamount(200000);
        m.withdrawamount(22);
    }
    
}
