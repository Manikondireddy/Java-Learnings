package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> sor= Arrays.asList(3,2,33,44,47,58,69,67,30,28,30);
        List<Integer> numbers= sor.stream()
                            .sorted()
                            .collect(Collectors.toList());
                            System.out.println("original list :" + sor);
                            System.out.println("numbers :" + numbers);
    }
    
}
