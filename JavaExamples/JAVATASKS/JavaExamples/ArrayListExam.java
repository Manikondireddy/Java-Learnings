package JavaExamples;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
    public static void main(String[] args) {
        ArrayList<String> numbers= new ArrayList<>();
        numbers.add("ten");
        numbers.add("twenty");
        numbers.add("thirty");
        numbers.add("fourty");
        numbers.add("fifty");
    System.out.println("first numbers" + numbers.get(0));
    numbers.set(2,"sixty");
    System.out.println("after replacing" + numbers);
    numbers.remove("fourty");
    System.out.println("after removing" + numbers);
    System.out.println("final number "  + numbers);
    for(String number:numbers)
    {
        System.out.println(number);
        System.out.println("total number" + numbers.size());
    }
}
}
