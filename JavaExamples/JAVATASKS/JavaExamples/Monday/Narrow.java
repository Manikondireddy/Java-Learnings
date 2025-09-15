package JavaExamples.Monday;
import java.util.HashMap;
import java.util.Map;

public class Narrow {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("mani",22);
        map.put("kiran",12);
        map.put("radha",23);
        map.put("mini",34);
        System.out.println("number of students in the list :" + map);
        int id= 12;
        Integer name=map.get(id);
        System.out.println("employee name :" +  "kiran " + id);
       
    }
    
}
