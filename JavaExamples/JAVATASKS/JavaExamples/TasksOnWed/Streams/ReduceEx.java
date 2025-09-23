package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;

public class ReduceEx {
    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(22,21,4,33,56,65,78,99);
         int sum = number.stream()
         .reduce(0,(a,b)->a+b );
         System.out.println("reducing the value :" + sum);
    }
    
}
