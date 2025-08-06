package JavaExamples.JAVATASKS;

 class BankAccount1 {
     double balance;
    public BankAccount1(double initialBalance) {
        balance = initialBalance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ");
    }
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrew ");
    }
    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount1 {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied");
        } else {
            super.withdraw(amount);
        }
    }
}
  public class BankAccount {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500);
        account.withdraw(200);
        account.withdraw(250);
        account.deposit(100);
        account.withdraw(250); 
    }
}
    

