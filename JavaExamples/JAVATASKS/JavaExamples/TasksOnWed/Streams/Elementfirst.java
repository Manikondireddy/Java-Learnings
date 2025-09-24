package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Elementfirst {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(10,20,3,40,30,50,6,90,56);
        Optional<Integer> number=num.stream()
        .filter(n->n > 50)
        .findFirst();
        number.ifPresent(n->System.out.println("greaterthan the 50 :" + number));
        
    }
    
}
