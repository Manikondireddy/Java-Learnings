package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops.JavaMethods;

public class Final {
    public void sendMessage(final String recipient) {
        System.out.println("Sending message to: " + recipient);
    }

    public static void main(String[] args) {
        Final messenger = new Final();
        messenger.sendMessage("Mani");
    }
}
    

