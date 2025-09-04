package JavaExamples;

public class SecondSmallest {
    public static void main(String[] args) 
    {
        int arr[] = {23, 45, 76, 9, 2, -2, 6, -100};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) 
            {
                 secondSmallest = smallest;
                  smallest = num;
                
            } 
            else if (num < secondSmallest && num != smallest)
             {
                secondSmallest = num;
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Second smallest number: " + secondSmallest);
    }
}


            
    
    
