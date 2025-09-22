package JavaExamples.Assesment2;

public interface Notification {
     public default  String send( )
     {
          return "abc";
          
     }
     
class EmailNotification implements Notification{
     @Override
     public String send()
     {
          System.out.println("emailnotification send");
          return  "def";

     }
}
class SmsNotification implements Notification
     {
     @Override
     public String send()
     {
          System.out.println("sms notification send");
          return "bcd";
     }
    
}
class PushNotification implements Notification
{
     @Override
     public String  send()
     {
          System.out.println("pushnotification send ");
          return "bvd";
          
     }
}
     public static void main(String[] args) {
     
          Notification w= new  EmailNotification();
          Notification w2= new SmsNotification();
          Notification w3 =new PushNotification();
          w.send();
          w2.send();
          w3.send();

               
          }
     }





     
    

