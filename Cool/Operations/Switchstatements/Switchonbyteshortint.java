package Cool.Operations.Switchstatements;

public class Switchonbyteshortint {
    public static void main(String[] args) {
        // Using byte
        byte byteValue = 2;
        switch (byteValue) {
            case 1 : System.out.println("Byte value is 1");
            case 2 : System.out.println("Byte value is 2");
            default : System.out.println("Byte value is something else");
        }
        short shortValue = 100;
        switch (shortValue) {
            case 50 : System.out.println("Short value is 50");
            case 100 : System.out.println("Short value is 100");
            default : System.out.println("Short value is something else");
        }
        int intValue = 500;
        switch (intValue) {
            case 100 : System.out.println("Int value is 100");
            case 500 : System.out.println("Int value is 500");
            default : System.out.println("Int value is something else");
        }
    }
}
    

