package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Parallel {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(12,89,22,44,89,90,44,22,4,90);
        List<Integer> num.stream()
                                 .peek(n->System.out.println("filtering :" + n))
                                 .filter(n-> n% 2==0)
                                 .map(n->n * n)
                                 collect(Collectors.toList());

                                 System.out.println("debugging the result :" + num );


    }
    
}
