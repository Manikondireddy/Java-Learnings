package JavaExamples;

public class Arr {
//     public static void main(String[] args) {
//         int numbers[]= {20,30,60,30,5022,66,22,54,34,200,30-200,3,0,1};
//         int smallest=numbers[0];
//         int largest =numbers[0];
//         for(int i=1;i<=numbers.length;i++)
//         {
//             if(numbers[i]<largest)
//             {
//                 largest=numbers[i];
//             }
//             if(numbers[i]>smallest)
//             {
//                 smallest=numbers[i];
//             }
//         }
//         System.out.println("largest numbers :" +largest);
//         System.out.println(("smallest number :" + smallest));
//     }
// }

// //     public static void main(String[] args) {
// //         int[] numbers = {25, 11, 7, 75, 56};  // example array

// //         int smallest = numbers[0];
// //         int largest = numbers[0];

// //         for (int i = 1; i < numbers.length; i++) {
// //             if (numbers[i] < smallest) {
// //                 smallest = numbers[i];
// //             }
// //             if (numbers[i] > largest) {
// //                 largest = numbers[i];
// //             }
// //         }

// //         System.out.println("Smallest number: " + smallest);
// //         System.out.println("Largest number: " + largest);
// //     }
// // }

// public static void main(String[] args) {
//     int [] numbers={20,40,339,33,22,1,-4,2,};
//     int smallest=numbers[0];
//     int largest = numbers[0];
//     for(int i=1;i< numbers.length;i++)
//     {
//         if(numbers[i]<smallest)
//         {
//             smallest=numbers[i];

//         }
//         if(numbers[i]>largest)
//         {
//             largest=numbers[i];
//         }

//     }
//     System.out.println("smallest numbers :" + smallest);
//     System.out.println("largest numbers :" + largest);
// }
// }




public static void main(String[] args) {
    int arr[]={2,7,33,78,90,-89,-33,200,46,22,10,8};
    int smallest=arr[0];
    int largest = arr[0];
    for(int i=1;i<arr.length;i++)
    {
        if(smallest<arr[i])
        {
            smallest=arr[i];

        }
        if(largest>arr[i])
        {
            largest = arr[i];
        }
    }
    System.out.println("largest number :" +largest);
    System.err.println("smallest number :" +smallest);
}
}