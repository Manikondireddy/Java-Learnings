package JavaExamples;

import java.util.Scanner;

public class Fibnoic {
    public static void main(String[] args) {
        int n=10;
        int first =0;
        int second =1;
        System.out.print("fibnoci sereies up to " + n + "term");
    }



for (int i = 1; i <= n; i++)
 {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

    }

    
    

    

