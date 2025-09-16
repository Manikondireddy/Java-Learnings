package JavaExamples.TUESDAY;
import java.util.ArrayList;

public class Maxmin {
    public static void main(String[] args) {
        int arr[]={23,78,89,-2,23,33,89,24,55,9,11,99,-100,3,22};
        int smallest=arr[0];
        int largest=arr[0];
        for(int i=1;i<arr.length;i++)
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
