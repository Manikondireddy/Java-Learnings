package JavaExamples.TasksOnWed.Streams.IntermediateandTerminal.PractingStreams;

import java.util.Arrays;

public class SmallestElement {
    public static void main(String[] args) {
        
        int arr[]={2,4,5,6,7,3,9,10,30,59,60};
        int k=3;
        int smallest=Arrays.stream(arr)
        .sorted()
        .skip(k-1)
        .findFirst()
        .orElse(-1);
        System.out.println("kth element in the list :" + smallest);

    }
    
} 
