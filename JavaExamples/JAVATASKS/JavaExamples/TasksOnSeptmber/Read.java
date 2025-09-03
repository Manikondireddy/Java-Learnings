package JavaExamples.TasksOnSeptmber;

 interface Payment {
    void AddAmount();
    void WithdrawAmount();
 }
 class Meals implements Payment
 {
    int balance=0;
    public void AddAmount(int amount)
    {
    balance= balance + amount;
    System.out.println("Added" + amount + "|Balance" + balance);
    }
    
 
 public void WithdrawAmount( int amount)
 {
    if(balance<=amount)
    {
        balance=balance-amount;
        
    }
    else{
        System.err.println("Withdraw" + amount + "|Balance" + balance);
    }
 }
class Read
{
    public static void main(String[] args) {
        Meals k= new Meals();
     k.AddAmount(10000);
     k.WithdrawAmount(5000);
     k.WithdrawAmount(20000);

    }
}
 }

    
        
    
