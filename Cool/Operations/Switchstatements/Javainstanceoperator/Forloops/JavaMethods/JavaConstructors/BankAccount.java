package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops.JavaMethods.JavaConstructors;

public class BankAccount {
String accountHolder;
    double balance;
    public BankAccount(String accountHolder, double initialDeposit) throws IllegalArgumentException {
        if (initialDeposit < 0) {
            throw new IllegalArgumentException("Initial deposit cannot be empty.");
        }

        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
    }

    public void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        try {
            BankAccount account1 = new BankAccount("Arjun", 5000);
            account1.displayAccount();

            BankAccount account2 = new BankAccount("Leela", -1000); 
            account2.displayAccount();
        } catch (IllegalArgumentException e) {
            System.out.println("Account created: " + e.getMessage());
        }
    }
}
    
