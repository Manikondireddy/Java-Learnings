package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Squ {
    public static void main(String[] args) {
        List<Integer> square = Arrays.asList(2,3,43,89,12,78,12,89,122);
        List<Integer> squ= square.stream()
                         .filter(n->n%2==0)
                         .map(n->n*n)
                         .collect(Collectors.toList());
                         System.out.println("square of the list:" + squ);
        
    }
    
}
