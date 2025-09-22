package JavaExamples.Monday;
 interface Payment {
    void addamount(double amount);
    void withdrawamount(double amount);
public class Phonepe implements Payment {
    private double  balance=0;
    @Override

    public void addamount(double amount)
    {
        balance+=amount;
        System.out.println(amount + "current adding amount :"+ balance );
    }
    @Override
    public void withdrawamount(double amount)
    {
        balance-=amount;
        System.out.println(amount +"current withdrawamount " + balance);
    }
}
 }
public class Payment {
    void pay() {
        System.out.println("Payment done");
    }
    public static void main(String[] args) {
        Phonepe p= new  Phonepe();
        p.addamount(20000);
        p.withdrawamount(200); 
    }

    
}
 
