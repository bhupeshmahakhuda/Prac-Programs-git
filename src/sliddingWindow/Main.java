package sliddingWindow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Start main
        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }
        int[] arr = new int[arr_size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        System.out.println("Enter the size of the window K: ");
        int k = sc.nextInt();

        System.out.println("The maximum sub Array sum is :::: "+ MaximumSubArrayOfSizeK.findMax(arr, k));
        // end main
    }
}
