package JavaExamples.TUESDAY;
interface Payment{
    void addamount(double amount );
    void withdrawamount(double amount);
}
class Mobile  implements Payment{
    public double balance =0;
    @Override
     public void addamount(double amount)
     {
        
        balance+=amount;
         System.out.println(balance  + "adding amount :" + amount );
     }
     @Override
     public void withdrawamount(double amount)
     {
      if(amount<=balance)
        {
        balance-= amount;
        System.out.println(balance + "withdrawamount :" + amount);
    }
    else{
        System.out.println(balance +"no amount is found " + amount);
    }
}

}



    


public class Random {
    public static void main(String[] args) {
        Mobile p= new Mobile();
        p.addamount(20000);
        p.withdrawamount(40000);
        p.withdrawamount(1000);
    }
    
}





