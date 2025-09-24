package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringPeek {
    public static void main(String[] args) {
        List<String> number= Arrays.asList("Mango","bananna","pineapple","apple","orange");
        List<String> num=number.stream()
                        .filter(n->n.startsWith("b"))
                        .peek(n->System.out.println("filtering the peek :" +n))
                        .collect(Collectors.toList());
                        System.out.println("filtering  peek :" + num);
                        
        

    }
    
}
