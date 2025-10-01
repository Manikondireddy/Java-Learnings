package JavaExamples.TasksOnWed.Streams.IntermediateandTerminal.PractingStreams;
import java.util.*;
import java.util.stream.*;

public class MergeSortedLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8);
        List<Integer> mergedList = Stream.concat(list1.stream(),list2.stream())
                                         .sorted()
                                         .collect(Collectors.toList());

        System.out.println("Merged and Sorted List: " + mergedList);
    }
}

    

