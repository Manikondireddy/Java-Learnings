package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops;

public class Variables {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Inside loop: i = " + i);
        }
        int j = 1;
        for (; j <= 3; j++) {
            System.out.println(" second loop: j = " + j);
        }
        System.out.println("Outside  loop: j = " + j);
    }
}
    
