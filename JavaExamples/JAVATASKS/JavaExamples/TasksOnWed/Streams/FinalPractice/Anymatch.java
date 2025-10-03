package JavaExamples.TasksOnWed.Streams.FinalPractice;
import java.util.Arrays;
import java.util.List;

public class Anymatch {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("python","c++","devpos");
         boolean name=names.stream()
                           .anyMatch(n->n.contains("java"));
                           System.out.println("any math in the word java :" + name);
    }
    
}
    

