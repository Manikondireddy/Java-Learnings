package JavaExamples.TasksOnWed;

public class Maxsss {
    public static void main(String[] args) {
        int arr[]={23,45,76,9,2,-2,6,-100};
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
        System.out.println("largest number :" + largest);
        System.out.println("smallest number :" + smallest);
    }
    
}
