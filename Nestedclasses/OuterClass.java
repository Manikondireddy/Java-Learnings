public class OuterClass {
    private static String message ="Hi team";
    public static class StaticNestedClass {
        public void displayMessage() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.displayMessage();
    }
}