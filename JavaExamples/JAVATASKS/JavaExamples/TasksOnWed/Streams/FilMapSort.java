package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilMapSort {
    public static void main(String[] args) {
        List<Integer> num=Arrays.asList(4,3,6,7,66,44,89,34,63,20);
        List<Integer> numbers =num.stream()
                             .filter(n->n%2==0)
                             .map(n->n*n)
                             .sorted()
                             .collect(Collectors.toList());
                             System.out.println("final list :" + numbers);

    }
    
}
