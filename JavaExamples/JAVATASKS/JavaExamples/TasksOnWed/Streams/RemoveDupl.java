package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupl {
    public static void main(String[] args) {
        List<Integer> sum= Arrays.asList(22,3,56,2,89,39,55,89,55,22,33,3,56,55);
        List<Integer> summer=sum.stream()
                            .distinct()
                            .collect(Collectors.toList());
                            System.err.println("After removing :" + summer);
    }
    
}
