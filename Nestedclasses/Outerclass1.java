   public class Outerclass1 {
    private String message = "Hello everyone";
    public class InnerClass {
        public void displayMessage() {
            System.out.println(" InnerClass: " + message);
        }
    }

    public void createInnerInstance() {
        InnerClass inner = new InnerClass();
        inner.displayMessage();
    }
    public static void main(String[] args) {
        Outerclass1 outer = new Outerclass1();
        Outerclass1.InnerClass inner = outer.new InnerClass();
        inner.displayMessage();
        outer.createInnerInstance();
    }
}


