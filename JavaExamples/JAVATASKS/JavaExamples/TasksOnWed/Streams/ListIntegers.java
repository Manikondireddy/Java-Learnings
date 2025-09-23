package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListIntegers {
    public static void main(String[] args) {
        List<Integer> res= Arrays.asList(1,3,4,7,2,8,9,33,89,20);
        List<Integer> result= res.stream()
        .sorted()
        .collect((Collectors.toList()));
        System.out.println("sorted order : " + result);
    }
    
}
