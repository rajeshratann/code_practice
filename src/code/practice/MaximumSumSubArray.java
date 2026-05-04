package code.practice;

public class MaximumSumSubArray {
    public static int maxSumSubArray(int[] arr, int k){
        int windowSum =0;
        for(int i=0; i<k; i++) windowSum +=arr[i];

        int maxSum = windowSum;

        for(int i=k; i<arr.length; i++) {
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSumSubArray(new int[]{2,1,5,1,3,2,8,1,6}, 4));
    }
}
