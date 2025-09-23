package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountNumber {
    public static void main(String[] args) {
        List<Integer> num=Arrays.asList(2,3,4,5,6,7,8,91,10);
     long count = num.stream()
     .filter(n->n>10)
     .count();
     System.out.println("after counting :" + num);
        
    }
    
}
