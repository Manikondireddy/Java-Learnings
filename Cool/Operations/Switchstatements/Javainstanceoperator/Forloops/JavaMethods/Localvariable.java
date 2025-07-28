package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops.JavaMethods;

public class Localvariable {
    public void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
    }
    public static void main(String[] args) {
        Localvariable nc = new Localvariable();
        nc.checkEvenOdd(7);
        nc.checkEvenOdd(18);
        nc.checkEvenOdd(0);
    }
}