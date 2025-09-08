package JavaExamples;
import java.util.Vector;

public class Vectorex {
    public static void main(String[] args) {
        Vector<String> animals= new Vector<>();
        animals.add("lion");
        animals.add("tiger");
        animals.add("deer");
        animals.add("monkey");
        animals.add("goat");
        System.out.println("all the animals" + animals);
        System.out.println("first animal" + animals.get(0));
        animals.remove(3);
        System.out.println("after removing"  + animals);
        System.out.println("replacing " + animals);
        animals.set(2,"sheep");
        System.out.println("all the animals one by one");
           System.out.println("All Animals One by One:");
        for (String animal : animals) {
            System.out.println(animal);
        }

    

        
    }
}
    

