package JavaExamples;

public class smlarge {
    public static void main(String[] args)
     {
        int arr[]={88,89,34,67,100,200,-2,78,98,30,};
        int smallest=arr[0];
        int largest= arr[0];
        for(int i=1;i<arr.length;i++)
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
        System.out.println("Smallest number" + smallest);
        System.out.println("largest number" + largest);

    }


        
    }
    

