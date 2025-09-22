package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DevStream {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("grapes","guava","pineapple","apple","apple","sapota");
        List<String> result=fruits.stream().filter(n-> n.startsWith("p")).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(result);


          
    }
    
}
