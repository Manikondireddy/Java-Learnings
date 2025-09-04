package JavaExamples;

public class Red {
     public static void main(String[] args) {
        int arr[] = {23, 45, 76, 9, 2, -2, 6, -100};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found!");
        } else {
            System.out.println("Second Largest Number is: " + secondLargest);
        }
    }
}









        
