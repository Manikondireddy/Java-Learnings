package JavaExamples.Tasks1234;
import java.util.HashMap;
import java.util.Map;

public class Frequent {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        char mostFrequent = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("frequent character: " + mostFrequent);
        System.out.println("Frequency: " + maxCount);
    }
}

    

