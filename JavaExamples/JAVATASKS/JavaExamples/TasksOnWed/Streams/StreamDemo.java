package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
   public static void main(String[] args) {
    List<String> names= Arrays.asList("mani","vani","queeni","rani","sudha");
    names.stream()
    .filter(name->name.startsWith("r"))
    .forEach(System.out::println);
   }
   }
