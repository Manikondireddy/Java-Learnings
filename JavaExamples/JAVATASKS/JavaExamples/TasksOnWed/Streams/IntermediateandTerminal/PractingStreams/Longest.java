package JavaExamples.TasksOnWed.Streams.IntermediateandTerminal.PractingStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Longest {
    public static void main(String[] args) {
        List<String> lon= Arrays.asList("mango","guava","orange","pineapple","sapota");
        
        Optional<String> longest=lon.stream()
                                 .max(Comparator.comparingInt(String::length));
                                 System.out.println("longest string :" + longest);
    }
    
}
