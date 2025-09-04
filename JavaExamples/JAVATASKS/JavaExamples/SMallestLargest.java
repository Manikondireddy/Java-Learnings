package JavaExamples;

public class SMallestLargest {
    public static void main(String[] args) {
        int arr[]={28,89,96,54,3,2,90,567,23,24,45,67,87,90};
        int smallest=arr[0];
        int largest= arr[0];
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
            System.out.println("smallest number " + smallest);
            System.out.println("largest number" + largest);

            }

        }
    }
    
    
    

