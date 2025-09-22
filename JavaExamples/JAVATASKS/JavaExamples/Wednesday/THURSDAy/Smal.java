package JavaExamples.Wednesday.THURSDAy;

public class Smal {
    public static void main(String[] args) {
        int arr[]= {11,20,3,-3,9,56,20,67};
        int small =arr[0];
        int large=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(small<arr[i])
            {
                small=arr[i];
            }
            if(large>arr[i])
            {
                large= arr[i];
            }
        }
            System.out.println("small number " + small);
            System.out.println("large number " + large);


            

        }
    }
    

