package JavaExamples;

public class LargestSmallest {
    public static void main(String[] args) {
        int[] arr={0,76,9,2,-2,6,-100};
        int smallest=arr[0];
        int largest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                smallest=arr[i];

            }
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("smallest number" + smallest);
        System.out.println("largest number" + largest);

        
    }
}

    

