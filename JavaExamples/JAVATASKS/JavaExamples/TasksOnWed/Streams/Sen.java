package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sen {
    public static void main(String[] args) {
        Set<Integer> number= new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,7,3));
        number.stream()
        .filter(n->n % 3==0)
        .forEach(System.out::println);
    }
    
}
