package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;

public class Lis {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("mango","bannana","apple","orange","pineapple");
        names.stream()
        .filter(name->name.length() >8)
        .forEach(System.out::println);

    }
    
}
