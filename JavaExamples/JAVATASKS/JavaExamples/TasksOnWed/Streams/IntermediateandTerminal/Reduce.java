package JavaExamples.TasksOnWed.Streams.IntermediateandTerminal;

import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,2,33,67,48,67,98);
         
        int numbers= num.stream()
                             .reduce(0,(a,b)->a+b);
                             System.out.println("sum of integers :" + numbers);
                             


    }
    
}
