package JavaExamples.TasksOnWed.Streams.FinalPractice;
    import java.util.Arrays;
import java.util.List;

import JavaExamples.PrimeCheck;

public class ListOfIntegers {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(12,3,4,33,9,99,56,67,8,55,3,78,4,5,6,1);
          boolean numbers=num.stream() 
                         .anyMatch(n->n >1  && java.util.stream.IntStream.rangeClosed(2, (int)Math.sqrt(n))
                         .allMatch(i->n% i !=0));
                         System.out.println("average number :" + numbers);

                         
    

    }
    
}
    
}
