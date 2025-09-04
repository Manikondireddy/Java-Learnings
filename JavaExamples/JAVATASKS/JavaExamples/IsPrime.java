package JavaExamples;
 import java.util.Scanner;

public class IsPrime {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { 
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        System.out.println("Prime numbers from 1 to " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        
        sc.close();
    }
}

    

