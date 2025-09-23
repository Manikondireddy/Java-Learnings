package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Peekoper {
    public static void main(String[] args) {
        List<Integer> pract= Arrays.asList(22,3,43,12,21,35,45,65,68,67,87,68,90,98,76,54);
        List<Integer> number= pract.stream()
        .filter(n->n%2==0)
        .peek(n-> System.out.println("filter value  :" + n))
        .collect(Collectors.toList());
        
        
    }
    
}
