package JavaExamples.TasksOnWed;

interface Payment {
    void AddAmount (double amount);
   void  withdrawAmount (double amount);

    
}
class Phonepe implements Payment{
    @Override
    public void AddAmount(double amount)
    {
        System.out.println("Adding amount :" + amount  );
    }
    @Override
    public void withdrawAmount(double amount)
    {
        System.out.println("withrawing amount" + amount);

    }
}

public class Jam {
    public static void main(String[] args) {
        Payment p = new Phonepe();
            
    
        p.AddAmount(2200);
        p.withdrawAmount(1000);
    }

    
}
