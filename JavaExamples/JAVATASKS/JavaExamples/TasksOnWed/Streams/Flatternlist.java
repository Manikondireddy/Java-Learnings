package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatternlist {
    public static void main(String[] args) {
        List<List<Integer>> Summer= Arrays.asList(
                                Arrays.asList(12,13,23,24,45,56),
                                Arrays.asList(33,4,3,0),
                                Arrays.asList(22,55,66,32,78),
                                Arrays.asList(12,30));
        List<Integer> sum=Summer.stream()                        
                                .flatMap(n->n.stream())
                                .collect(Collectors.toList());
                                System.out.println("flattern the list :" + Summer );
                                

    }
    
}
