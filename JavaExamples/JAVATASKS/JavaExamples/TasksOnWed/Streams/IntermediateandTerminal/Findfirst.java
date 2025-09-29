package JavaExamples.TasksOnWed.Streams.IntermediateandTerminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Findfirst {
    public static void main(String[] args) {
        List<Integer>res= Arrays.asList(23,90,23,44,35,89,21,22,90,44,35);
        Optional<Integer> num= res.stream()
                              .filter(n->n >50)
                              .findFirst();
                              num.ifPresent(n->System.out.println("filtering :" + n));
    }
    
}
