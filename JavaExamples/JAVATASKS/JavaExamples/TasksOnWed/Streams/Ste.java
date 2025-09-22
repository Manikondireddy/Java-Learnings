package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;

public class Ste {
    public static void main(String[] args) {
        List<Integer> map= Arrays.asList(20,30,70,40,2,4,2,1);
        map.stream()
        .filter(n->n %2==0)
        .forEach(System.out::println);

    }
    
}


