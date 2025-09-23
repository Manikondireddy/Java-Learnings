package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapSort {
    public static void main(String[] args) {
        List<String> number=Arrays.asList("mango","apple","pineapple","guava","orange","grapes","avocoda","sapota");
        List<String> num= number.stream()
                                .filter(n->n.startsWith("g"))
                                .map(String::toUpperCase)
                                .sorted()
                                .collect(Collectors.toList());
                                System.out.println("print all the names started :" + num);
    }
    
}
