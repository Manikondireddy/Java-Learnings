package JavaExamples.Tasks1234;


    import java.util.*;

public class SecondMost {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        char first = 0;
        char second = 0;
        int max1 = 0;
        int  max2 = 0;

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            int count = entry.getValue();
            if (count > max1) {
                max2 = max1;
                second = first;
                max1 = count;
                first = entry.getKey();
            } else if (count > max2) {
                max2 = count;
                second = entry.getKey();
            }
        }

        System.out.println("2nd most frequent character: " + second);
        System.out.println("Frequency: " + max2);
    }
}

    

