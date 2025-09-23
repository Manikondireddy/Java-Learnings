package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectex {
    public static void main(String[] args) {
        List<String> sum= Arrays.asList("arun","varun","Tharun","amal","anu");
        List<String> mus=sum.stream()
                            .filter(n->n.startsWith("a"))
                            .collect(Collectors.toList());
                         System.out.println("starting with a: " + mus);
              
        
        
    }
    
}

