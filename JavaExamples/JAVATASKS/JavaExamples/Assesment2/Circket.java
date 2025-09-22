package JavaExamples.Assesment2;
import java.util.TreeMap;
import java.util.Map;

public class Circket {
    String CircketName;
int runs;
public Circket(String CircketName,int runs )
{
    this.CircketName=CircketName;
    this.runs=runs;

}
    public static void main(String[] args) {
        TreeMap<Integer,String> map= new TreeMap<>();
        map.put(66, "ball");
        map.put(5, "bat");
        map.put(9, "ball");
        map.put(99, "bat");
        map.put(89, "teams");
        map.put(8, "ball");
        System.out.println("Circket team :" + map);
        for(Map.Entry<Integer,String> entry:map.entrySet())
        {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        System.out.println("after iterating :" + map);
        int searchid =89;
        boolean name= map.containsKey(searchid);
        System.out.println("display uniuque circketers :" + map.get(searchid));
        
        System.out.println("final resuit :" + map );


        

    }



}

    

