package JavaExamples;
import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> number= new LinkedList<>();
        number.add("one");
        number.add("two");
        number.add("three");
        number.add("four");
        number.add("five");
        number.add("six");
        System.out.println("number of number :" + number);
        System.out.println("first number :" + number.get(0));
        number.addFirst("0");
        System.out.println("adding first :" + number);
        number.addLast("six");
        System.out.println("adding last :" + number);
        number.remove(3);
        System.out.println("After removing" +number);
        number.set(2,"seveen");
        System.out.println("After replacing" + number);
        for(String numbers:number)
        {
            System.out.println(number);
           System.out.println("final size :" + number);
           System.out.println("array is not in the list :");
           System.out.println("nothing in the list :");
           for(int i=0;i<=10;i++)
           {
            
           }
        }
        

    }
    
}
