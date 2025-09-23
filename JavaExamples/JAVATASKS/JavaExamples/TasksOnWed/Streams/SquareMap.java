package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareMap {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(12,22,13,2,1,4,5,88,56,44,98,60,50,80,90);
        List<Integer> num= numbers.stream()
        .map(n->n*n)
        .collect(Collectors.toList());
        System.out.println("after square of list :" + num);
        
    }
    
}
