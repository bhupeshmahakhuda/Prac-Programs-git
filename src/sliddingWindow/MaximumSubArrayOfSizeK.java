package sliddingWindow;

public class MaximumSubArrayOfSizeK {
    public static int findMax(int arr[], int k){
        int start =0;
        int sum =0;
        int maxSum=0;

        for(int end=0;end<arr.length;end++){
            sum = sum + arr[end];

            if(end >= k-1){
                maxSum = Math.max(sum,maxSum);
                sum -= arr[start++];
            }
        }

        return maxSum;
    }
}

// arr = {2,1,5,1,3,2}
// k= 3
//Output : 9

// We can make sub arrays of size 3 like {2,1,5}, {1,5,1}, {5,1,3}, {1,3,2}
// {5,1,3} = 9 which is maximum .