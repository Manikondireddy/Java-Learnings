package JavaExamples.TasksOnWed.Streams.IntermediateandTerminal.PractingStreams;


import java.util.*;
import java.util.stream.*;

public class ListIntersection {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> intersection = list1.stream()
                                          .filter(list2::contains)
                                          .collect(Collectors.toList());
             System.out.println("Intersection: " + intersection);
    }
}

    

