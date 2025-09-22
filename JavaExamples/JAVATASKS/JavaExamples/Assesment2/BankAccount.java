package JavaExamples.Assesment2;

abstract  class BankAccount {
     abstract void  deposit(double amount) ;
     abstract void withdraw(double amount);
     String Accountnumber;
     String balance;
     
}


class SavingAccount extends BankAccount{
     public String AccountNumber;
     public String balance;
     private double amount =0;
     @Override
     public void deposit(double amount)
     {
        
        
        System.out.println(amount + "current deposit ");
     }
     @Override
     public void withdraw(double amount)
     {
        System.out.println(amount +"current withraw ");
     }
    }
    class CurrentAccount extends BankAccount{
        @Override
        public void deposit(double amount)
        {
            System.out.println(amount + "currentamount");
        }
        @Override
        public void withdraw(double amount )
        {
            System.out.println(amount + "current withdraw");
        }
        public static void main(String[] args) {
            BankAccount m= new SavingAccount();
            BankAccount m1= new CurrentAccount();
            m.deposit(4000);
            m1.withdraw(200000);
            m1.withdraw(500);
                
            };
        }
    





    




