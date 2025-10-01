package JavaExamples.TasksOnWed.Streams.IntermediateandTerminal.PractingStreams;
    import java.util.*;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("mani", "mini", "mahi", "madhu", "mini");
        List<String> nameList = names.stream()
                                     .collect(Collectors.toList());
        System.out.println("List: " + nameList);
        Set<String> nameSet = names.stream()
                                   .collect(Collectors.toSet());
        System.out.println("Set: " + nameSet);
        Map<String, Integer> nameLengthMap = names.stream()
                                                  .distinct()
                                                  .collect(Collectors.toMap(
                                                      name -> name,
                                                      name -> name.length()
                                                  ));
        System.out.println("Map: " + nameLengthMap);
        String allNames = names.stream()
                               .distinct()
                               .collect(Collectors.joining(", "));
        System.out.println("Joined Names: " + allNames);
        int totalLength = names.stream()
                               .collect(Collectors.summingInt(String::length));
        System.out.println("Total Length: " + totalLength);
    }
}

    

