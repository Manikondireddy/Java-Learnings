package JavaExamples.TasksOnWed;
import java.util.LinkedHashSet;
import java.util.HashSet;
public class SetExample {
    public static void main(String[] args) {
        HashSet<String> fruits= new LinkedHashSet<>(); 
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("bananna");
        fruits.add("pineapple");
        fruits.add("guava");
        System.out.println("Before  removing fruits :" + fruits);
        fruits.remove("bananna");
        System.out.println("After removing fruits : " +fruits );
            
        };
    }
    

