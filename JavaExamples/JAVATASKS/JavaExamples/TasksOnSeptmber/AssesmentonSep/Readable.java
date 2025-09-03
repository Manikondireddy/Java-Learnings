package JavaExamples.TasksOnSeptmber.AssesmentonSep;

import JavaExamples.JAVATASKS.AddMethod;

  interface Payment {
    void AddAmount();
     void WithdrawAmount();
 }
 class PhonePe implements Payment
  {
     int balance=0;
   public void AddAmount(int amount)
     {
     balance= balance+amount;
     System.out.println("Added" + amount + "|Balance" + balance);

  }
 public void WithdrawAmount(int amount)
  {
 if(amount<=balance)
 {
balance = balance-amount;
 System.out.println("withdraw" + amount +"|Balance "+ balance);
 }
 else{
     System.out.println("enough amount");
 }


 }
  }
  class Readable
  {
   public static void main(String[] args) {
        PhonePe p= new PhonePe();
        p.AddAmount(10000);
        p.WithdrawAmount(5000);
        p.WithdrawAmount(7000);

    }
 }
 


    


    

