package JavaExamples.Wednesday;

public class Maxmin {
    public static void main(String[] args) {
        int arr[]={22,67,89,30,48,47,33,90,4,-23,9,-3,99,-100,32};
        int maximum=arr[0];
        int minimum= arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(maximum<arr[i])
            {
                maximum=arr[i];

            }
            if(minimum>arr[i])
            {
                minimum=arr[i];

            }
        }
        System.out.println("maximum number :" + maximum);
        System.out.println("minimum number :" + minimum);
    }
    
}
