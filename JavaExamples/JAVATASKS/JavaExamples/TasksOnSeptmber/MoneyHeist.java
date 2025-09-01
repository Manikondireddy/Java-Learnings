package JavaExamples.TasksOnAuguest;
    public class MoneyHeist {
    
    private String account;
    private String Holder;
    private double balance;
    public MoneyHeist(String account, String Holder, double Balance) {
        this.account = account;
        this.Holder = Holder;
        this.balance = Balance;
    }
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getHolder() {
        return Holder;
    }

    public void setHolder(String Holder) {
        this.Holder = Holder;
    }


    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {

        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(balance + amount);
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println(" Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            setBalance(balance - amount);
            System.out.println(" Withdrawn: " + amount);
        } else {
            System.out.println(" Insufficient balance");
        }
    }
    public void displayAccountInfo() {
        System.out.println(" Account : " + account);
        System.out.println("Holder: " + Holder);
        System.out.println(" Balance: " + balance);
    }
    public static void main(String[] args) {
        MoneyHeist heist = new MoneyHeist("ACC007", "Employee", 5000);

        heist.displayAccountInfo();

        heist.deposit(2000);
        heist.withdraw(1500);

        System.out.println(" Final Balance: " + heist.getBalance());
    }
}

    
    

