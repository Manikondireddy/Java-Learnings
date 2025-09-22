package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LisIntegers {
    public static void main(String[] args) {
        List<Integer> sum= Arrays.asList(20,4,9,5,00,44,2,45,66,45,3,2,0,664);
        List<Integer> v= sum.stream()
                         .sorted()
                         .collect(Collectors.toList());
                         System.out.println("original list :" + sum);
                         System.out.println("sorted list :" + v);
    }



    }
    

