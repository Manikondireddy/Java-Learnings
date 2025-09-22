package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;

public class ForEachex {
    public static void main(String[] args) {
        List<Integer> sam= Arrays.asList(2,3,4,55,44,89,5);
         sam.stream()
        .forEach(System.out::println);
    }
}