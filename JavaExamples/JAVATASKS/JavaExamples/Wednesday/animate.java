package JavaExamples.Wednesday;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class animate {
    public static void main(String[] args) {
        HashMap<Integer,String> nap= new HashMap<>();
        nap.put(22, "grapes");
        nap.put(4, "jackfruit");
        nap.put(7, "orange");
        nap.put(55, "pineapple");
        nap.put(12, "apple");
        nap.put(33,"bananna");
        nap.put(4,"sapota");
        nap.put(99, "lemon");
        System.out.println("list of student in the list :" + nap);
        nap.remove("orange");
        System.out.println("After removing in the list :" + nap);
        int searchid=33;
        String name=nap.get(searchid);
        System.out.println("current system in the data :" + nap.get(searchid));
        for(Map.Entry<Integer,String> entry :nap.entrySet())
        {
            System.out.println(entry.getKey() +" -->" + entry.getKey());
        }
        nap.put(88,"tomato :");
        System.out.println("after adding into the list :" + nap); 
        nap.put(7,"axe");
        System.out.println("before  adding the test : " + nap);
        System.out.println("before adding into the list : " + nap);
        nap.put(2, "chille ");
        System.out.println("array in the list " + nap);
        nap.remove("sapota");
        System.out.println("After removing into the list :" + nap);
        nap.put(2, "avacoda");
        System.out.println("after adding into the list :" + nap);

        
    }
    
}
