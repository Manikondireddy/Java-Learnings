package JavaExamples.TasksOnSeptmber;


    import java.util.*;
    class HashMapDemo
    {
        public static void main(String[] args) {
            
        
        HashMap<String,String> map=new HashMap<>();
        for(int i=1;i<=10;i++)
        {
            map.put("key" + i,"value" +i);

        }
        for(String value:map.values())
        {
            System.out.println(value);
        }
    }
}


    
