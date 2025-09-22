package JavaExamples.Wednesday.THURSDAy;

public class Lar {
    public static void main(String[] args) {
        int arr[]={1,34,53,31,3,-99,45,90,0,9};
        int smallest=arr[0];
        int largest= arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(smallest<arr[i])
            {
                smallest=arr[i];
            }
            if(largest>arr[i])
            {
                largest=arr[i];
            }
        }
        System.out.println("smallest number :" + smallest);
        System.out.println("largest number :" + largest);
    }
    
}
