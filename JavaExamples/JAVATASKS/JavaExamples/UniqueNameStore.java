package JavaExamples;

    import java.util.HashMap;

public class UniqueNameStore {
    public static void main(String[] args) {
        HashMap<String, Integer> nameMap = new HashMap<>();
        addName(nameMap, "Mani");
        addName(nameMap, "Mini");
        addName(nameMap, "Mahi");
        System.out.println("Unique names:");
        for (String name : nameMap.keySet()) {
            System.out.println(name);
        }
    }
    public static void addName(HashMap<String, Integer> map, String name) 
    {
        if (!map.containsKey(name)) 
        {
            map.put(name, 1); 
            System.out.println("Added: " + name);
        } else {
            System.out.println("Duplicate ignored: " + name);
        }
    }
}
    

