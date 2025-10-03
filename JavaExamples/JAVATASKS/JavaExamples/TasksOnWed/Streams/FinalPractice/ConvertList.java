package JavaExamples.TasksOnWed.Streams.FinalPractice;
    import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertList {
    public static void main(String[] args) {
        List<String> sum =Arrays.asList("mango","pineapple","pineapple","sapota");
        List<String> even=sum.stream()
                           .map(String::toUpperCase)
                           .collect(Collectors.toList());
                           System.out.println("original list :" + sum);
                           System.out.println("even :" + even);


    }
    
    
}
