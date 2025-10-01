package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;

public class Allintegers {
    public static void main(String[] args) {
        List<Integer> num=Arrays.asList(12,11,2,33,3,44,4,55,88,99,40,50);
       
        int sum = num.stream()
                    .reduce(0,(a,b)->(a+b));
        System.out.println("sum of numbers: " + sum); 



        


                
        
    }
    
}
