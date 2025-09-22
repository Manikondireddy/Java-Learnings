package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamreuse {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(20,4,59,30,66,40);
        Stream<Integer> Stream = numbers.stream();
        Stream.forEach(System.out::println);
        // Stream.count(); 
        
    }
    
}
