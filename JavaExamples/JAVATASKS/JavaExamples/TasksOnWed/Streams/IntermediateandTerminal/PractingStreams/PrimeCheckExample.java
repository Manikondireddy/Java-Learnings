package JavaExamples.TasksOnWed.Streams.IntermediateandTerminal.PractingStreams;


import java.util.*;
import java.util.stream.*;

public class PrimeCheckExample {
    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        return IntStream.rangeClosed(2, (int)Math.sqrt(number))
                        .allMatch(n -> number % n != 0);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 6, 8, 9, 10, 11, 15);
        boolean hasPrime = numbers.stream()
                                  .anyMatch(PrimeCheckExample::isPrime);

        System.out.println("Contains prime : " + hasPrime);
    }
} 



    

