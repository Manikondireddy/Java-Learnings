package JavaExamples.Monday;

public class MaxMin1 {
    
    public static void main(String[] args) {
        int arr[]={22,78,-89,60,56,88,-98,23,67,34,89,33,20,-8};
        int maximum=arr[0];
        int minimum= arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(maximum <arr[i])
            {
                maximum=arr[i];
            }
            if(minimum> arr[i])
            {
                minimum=arr[i];
            }
        }
        System.out.println("maximum number : "+ maximum);
        System.out.println("minimum number : " + minimum);
    }
}
