package JavaExamples.Wednesday.THURSDAy;

public interface Payment {
    void addamount(double amount);
    void withdrawamount(double amount);
}
class Phonepe implements Payment{
    private double balance=0;
    @Override
    public void addamount(double amount)
    {
        System.out.println(amount + "current adding amount :" + balance);
    }
    @Override
    public void withdrawamount(double amount)
    {
        System.out.println((amount + "current withraw amount :" + balance));
    }
    public static void main(String[] args) {
        Payment i=new Phonepe();
        i.addamount(20000);
        i.withdrawamount(344454);
    }
}

