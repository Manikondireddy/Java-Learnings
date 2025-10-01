package JavaExamples.TasksOnWed.Streams.IntermediateandTerminal.PractingStreams;
    import java.util.*;
import java.util.stream.Collectors;

public class BulkOperationsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 8, 1, 4, 3);
        List<Integer> processed = numbers.stream()
                                         .filter(n -> n % 2 == 0)     
                                         .distinct()                  
                                         .map(n -> n * 10)            
                                         .sorted()                   
                                         .collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("Processed List: " + processed);
    }
}

    

