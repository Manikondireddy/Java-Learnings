package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops.JavaMethods;

public class Multiplereturn {
    public String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Multiplereturn gc = new Multiplereturn();
        System.out.println("Score 95: Grade " + gc.getGrade(95));
        System.out.println("Score 75: Grade " + gc.getGrade(75));
        System.out.println("Score 50: Grade " + gc.getGrade(50));
    }
}
    

