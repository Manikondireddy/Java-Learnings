package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reduceexample {
    public static void main(String[] args) {
        List<Integer> res= Arrays.asList(12,31,2,3,4,5,6,7,9,89);
        int sum= res.stream()
        .reduce(0,(a,b)-> a+b);
        // .collect(Collectors.toList());
        System.out.println("finallist :" + sum);
    }
    
}
