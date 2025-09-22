package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtereven {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(2,3,56,66,90,77,45,33,78,44,90,20,30,58,50,68,79,78);
        List<Integer> evennumbers = numbers.stream()
                                       .filter(n ->  n % 2==0)
                                       .collect(Collectors.toList());
                                       System.out.println("original:" + numbers);
                                       System.out.println("evennumbers :" + evennumbers );

    }
    
}
