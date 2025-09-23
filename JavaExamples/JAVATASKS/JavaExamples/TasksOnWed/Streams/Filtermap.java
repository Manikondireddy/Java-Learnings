package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filtermap {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(4,3,5,22,3,78,66,89,12,33);
        List<Integer> numbers=num.stream()
                                 .filter(n->n %2==0)
                                 .collect(Collectors.toList());
                                 System.out.println("final list :" + numbers);
    }
    
}
