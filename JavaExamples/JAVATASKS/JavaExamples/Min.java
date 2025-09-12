package JavaExamples;

public class Min {
    public static void main(String[] args) {
        int arr[]={22,60,34,76,90,-99,-41};
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
    System.out.println("maximu number  :" +smallest);
    System.out.println("minimum number :" + largest);
    
}
}
