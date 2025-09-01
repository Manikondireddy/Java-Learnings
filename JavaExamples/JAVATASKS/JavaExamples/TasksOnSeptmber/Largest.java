package JavaExamples.TasksOnSeptmber;

public class Largest {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 34, 89, 23, 5, 99, 1};

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Largest number: " + largest);
        System.out.println("smallest number" + smallest);
    }
}


