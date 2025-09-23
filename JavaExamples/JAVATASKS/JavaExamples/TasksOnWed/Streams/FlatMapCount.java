package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapCount {
    public static void main(String[] args) {
        List<List<String> >result=Arrays.asList( 
                                Arrays.asList("guava","apple","orange","guava"),
                                Arrays.asList("yellow","pink","blue"),
                                Arrays.asList("animal","pig","donkey"),
                                Arrays.asList("rose","lilly"));
                                   
           long res= result.stream()
           .flatMap(List::stream)
           .map(String::toLowerCase)
           .filter(n->n.startsWith("a"))
           .count();
           System.out.println("starting with a :" + res);














        
       
        
    }
    
}
