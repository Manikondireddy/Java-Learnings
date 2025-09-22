package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Random {
    public static void main(String[] args) {
        Set<String> names= new HashSet<>(Arrays.asList("mango","Apple","pineapple","Apple","mango","Orange"));
        names.stream()
        .map(String::toUpperCase)
        .forEach(System.out::println);


    }
    
}
