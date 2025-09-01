package JavaExamples.TasksOnAuguest;
    public class BankAccount {
    private double balance;
    public BankAccount(double initial) {
        balance = initial;
    } 
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
   public void withdraw(double amount) {
    
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); 
        account.checkBalance();

        account.deposit(500);
        account.checkBalance();

        account.withdraw(300);
        account.checkBalance();

        account.withdraw(2000); 
    }
}

