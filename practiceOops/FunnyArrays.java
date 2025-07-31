package practiceOops;
import java.util.*;

public class FunnyArrays {
    public static void main(String[] args) {
        int[] arr = {3, 7, 13, 42, 1, 99, 0, -7, 8, 23};
        int number = 22;
    System.out.println("Array numbers");

        boolean found = false;
        for (int num : arr) {
            if (num == number) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Array is printing " + number+ " Array is ok it can print true");
        } else {
            System.out.println("Array is not printing" + number + " Array is not ok print false");
        }
    }
}
    

