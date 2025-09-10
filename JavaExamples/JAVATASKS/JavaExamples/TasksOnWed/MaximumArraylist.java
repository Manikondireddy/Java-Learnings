package JavaExamples.TasksOnWed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MaximumArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(22);
        numbers.add(44);
        numbers.add(45);
        numbers.add(37);
        numbers.add(101);
        numbers.add(-34);
        numbers.add(-2);
        numbers.add(22);
        System.out.println("Numbers list : " + numbers);
        int max= Collections.max(numbers);
        int min= Collections.min(numbers);
        System.out.println("maximum : " + max);
        System.out.println("minimum :" + min);
    }
}

        





































// import java.util.ArrayList;
// import java.util.Collections;

// public class MaxMinArrayList {
//     public static void main(String[] args) {
//         ArrayList<Integer> numbers = new ArrayList<>();
//         numbers.add(45);
//         numbers.add(12);
//         numbers.add(78);
//         numbers.add(34);
//         numbers.add(90);

//         System.out.println("Numbers: " + numbers);

//         int max = Collections.max(numbers);
//         int min = Collections.min(numbers);

//         System.out.println("Maximum: " + max);
//         System.out.println("Minimum: " + min);
//     }
// }
