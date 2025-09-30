package JavaExamples.TasksOnWed.Streams.IntermediateandTerminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        
        IntStream.rangeClosed(1,100)
                             .filter(n-> n % 5 ==0)
                             .parallel()
                             
                            .forEach(System.out::println);

                             



    }
    
}
