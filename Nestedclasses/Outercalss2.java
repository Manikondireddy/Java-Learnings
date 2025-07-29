public class Outercalss2 {
    private String outerMessage = "Hello hi";

    public void display() {
        String localMessage = "Hello fission labs";
        class LocalClass {
            void printMessages() {
                System.out.println(outerMessage);
                System.out.println(localMessage);
            }
        }
        LocalClass local = new LocalClass();
        local.printMessages();
    }

    public static void main(String[] args) {
        Outercalss2 outer = new Outercalss2();
        outer.display();
    }
}

    

