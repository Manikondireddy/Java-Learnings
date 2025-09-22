package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SortCollect {
    public static void main(String[] args) {
        List<String> fruits=Arrays.asList("mango","banana","guava","apple","mango");
            List<String> sortedNames = fruits.stream().sorted().collect(Collectors.toList());
            System.out.println(sortedNames );


    }
    
}
