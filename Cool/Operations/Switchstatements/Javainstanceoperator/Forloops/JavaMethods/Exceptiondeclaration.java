package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops.JavaMethods;
import java.io.*;

public class Exceptiondeclaration {
    public void readFile(String fileName) throws IOException {
        FileReader reader = new FileReader(fileName);
        reader.read();
        reader.close();
    }
    public void waitForIt() throws InterruptedException {
        Thread.sleep(1000);
    }

    public void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
    }

    public static void main(String[] args) {
        Exceptiondeclaration demo = new Exceptiondeclaration();

        try {
            demo.readFile("data.txt");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        try {
            demo.waitForIt();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        try {
            demo.checkAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Age check failed: " + e.getMessage());
        }
    }
}
    

