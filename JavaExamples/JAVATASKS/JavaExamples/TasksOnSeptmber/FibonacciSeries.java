package JavaExamples.TasksOnSeptmber;
    import java.util.Scanner;
public class FibonacciSeries {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.println(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
   

    

