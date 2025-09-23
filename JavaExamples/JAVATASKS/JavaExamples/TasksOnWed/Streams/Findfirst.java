package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Findfirst {
    public static void main(String[] args) {
        List<String> result = Arrays.asList("camel","cat","goat","hen","car","duck");
        Optional<String> res=result.stream()
                           .filter(n->n.startsWith("c"))
                           .findFirst();

res.ifPresent(n->System.out.println("starting  with the letter c is:" + n));
    }
    
}
