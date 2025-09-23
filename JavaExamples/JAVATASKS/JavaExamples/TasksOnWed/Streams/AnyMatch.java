package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {
    public static void main(String[] args) {
        List<String> anymatch= Arrays.asList("pyton","clanguage","oracle","c++");
        boolean match= anymatch.stream()
                            .anyMatch(n->n.contains("java"));
                            System.out.println("any string contain java :" + match);
    }
    
}
