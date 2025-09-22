package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyExample {
    public static void main(String[] args) {
        List<Integer> sum= Arrays.asList(3,5,98,33,2,43,78,55,89,4,1,2,0);
        
        Stream<Integer> stream = sum.stream()
                                        .filter(n -> {
                                            System.out.println("Filtering: " + n);
                                            return n % 2 == 0;
                                        })
                                        .map(n -> {
                                            System.out.println("Mapping: " + n);
                                            return n * n;
                                        });

        System.out.println("Stream created but no output yet.");

       
        List<Integer> result = stream.collect(Collectors.toList());
        System.out.println("Result: " + result);
    }
}
    
    
