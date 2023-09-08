package algoByWayneAndSedgewickOfPrincetonUniversity.week1.assignment1;

import java.util.Arrays;
import java.util.Random;

public class KnuthOrFisherYatesShuffleAlgo {
    public static void randomize(int[] arr, int n){
        Random random =  new Random();

        for(int i=n-1;i>0;i--){
            // will pick from 0 to i
            int j = random.nextInt(i+1);

            //swapping elements
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        randomize(arr, n);
    }
}
