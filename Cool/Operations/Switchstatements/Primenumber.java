package Cool.Operations.Switchstatements;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("prime numbers up to "+ n + " ");
        for(int num =2;num<=n; num++)
        {
            boolean isPrime = true;
            for(int i =2;i <num;i++)
            {
                if(num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println(num + " ");
            }
                }
            }
        
      
    }
    
    
        

    

