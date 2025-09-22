package JavaExamples;


public class MinMax {
    public static void main(String[] args) {
        int arr[]= {22,-3,44,89,3,67,-100,37,99,34,67,78};
        int smallest =arr[0];
        int largest = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(smallest<arr[i])
            {
                smallest=arr[i];
            }
            if(largest>arr[i])
            {
                largest = arr[i];
            }
            System.out.println("smallest number " + smallest);
            System.out.println("largest number " + largest);
        }
    }
    
}
