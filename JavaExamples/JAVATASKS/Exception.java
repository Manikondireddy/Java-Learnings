public class Exception {
public static void main(String[] args) {
        try {
            System.out.println("Outer block");
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e)
             {
                System.out.println("Inner " + e);
            }
            String str = null;
            System.out.println(str.length()); 
        } 
        catch (NullPointerException e)
         {
            System.out.println("Outer catch: " + e);
        }
    }
}
    

