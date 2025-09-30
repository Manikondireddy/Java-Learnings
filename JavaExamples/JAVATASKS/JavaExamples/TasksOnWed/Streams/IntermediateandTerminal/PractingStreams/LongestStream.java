package JavaExamples.TasksOnWed.Streams.IntermediateandTerminal.PractingStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class LongestStream {
    public static void main(String[] args) {
        List<String>  numbers= Arrays.asList("apple", "banana", "grapes", "watermelon", "kiwi");
        String lon = numbers.stream()
                       .max(Comparator.comparingInt(String::length))
                       .orElse(null);
                       System.out.println("longest string :" + lon);
                       
                          
    }
    
}
 