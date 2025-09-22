package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectNew {
    public static void main(String[] args) {
        List<String> result= Arrays.asList("apple","orrange ","apples","grapes");
        result.stream()
        .filter(n->n.startsWith("a"))
        .collect(Collectors.toList())
    .forEach(System.out::println);

    }
    
}
