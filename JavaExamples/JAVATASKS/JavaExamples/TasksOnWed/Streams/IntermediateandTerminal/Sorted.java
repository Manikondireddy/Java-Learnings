package JavaExamples.TasksOnWed.Streams.IntermediateandTerminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<String> name=Arrays.asList("raju","rani","krishna","renu");
        List<String> nam=name.stream()
        .filter(n->n.startsWith("r"))
        .map(String::toUpperCase)
        .sorted()
        .collect(Collectors.toList());
        System.out.println("sorted in order :" + nam);

    }
    
}
