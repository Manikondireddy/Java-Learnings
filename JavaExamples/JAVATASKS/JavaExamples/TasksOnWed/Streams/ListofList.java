package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListofList {
    public static void main(String[] args) {
        List<List<String>> num=Arrays.asList(
                               Arrays.asList("mango","guava","strawberry","apple"),
                               Arrays.asList("pineapple","orange","sapota","brerry"),
                               Arrays.asList("grapes","sapota"));
        List<String> number=num.stream()
                           .flatMap(n->n.stream())
                           .collect(Collectors.toList());
                           System.out.println("flatten :" + num);
    }
    
}
