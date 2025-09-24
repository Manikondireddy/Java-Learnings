package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountNumbers {
    public static void main(String[] args) {
        List<Integer> lan= Arrays.asList(12,32,34,56,78,23,89,90);
        long count=lan.stream()
        .filter(n->n >10)
        .count();
        System.out.println("no greaterthan 10 :" + lan);
        
    }
    
}
