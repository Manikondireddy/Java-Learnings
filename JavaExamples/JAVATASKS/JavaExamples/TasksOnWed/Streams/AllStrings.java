package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllStrings {
    public static void main(String[] args) {
        List<String> number=    Arrays.asList("rani","raju","theif","police");
        List<String> num= number.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
        System.out.println("convert strings to uppercase :" + num);
    }
    
}
