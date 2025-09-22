package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flattern {
    public static void main(String[] args) {
        List<List<Integer> >winter= Arrays.asList(
                                   Arrays.asList(20,3,45,89),
                                   Arrays.asList(30,40,45,9),
                                   Arrays.asList(30,90,9),
                                   Arrays.asList(2,3,9),
                                   Arrays.asList(40,5));
              List<Integer>numbers= winter.stream()
                                    .flatMap(list->list.stream()) 
                                    .collect(Collectors.toList()) ;
                                    System.out.println("final list :" + numbers);                                  







                               
                            

    }
    
}
