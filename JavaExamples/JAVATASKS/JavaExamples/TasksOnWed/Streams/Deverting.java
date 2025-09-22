package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Deverting {
    public static void main(String[] args) {
        List<Integer> searching= Arrays.asList(3,44,67,89,34,89,45,67,23,90,21,23);
        List<Integer> search =searching.stream()
                             .filter(n-> n%2 ==0)
                             .peek(n -> System.out.println("filtering values :" + n))
                             .collect(Collectors.toList());
                             System.out.println("original list :" + searching);
                             System.out.println("searching number :" + search);
        
    }
    
}
