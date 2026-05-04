package code.practice;

public class FindMissingNumber {
    public static int missingNumber(int[] nums){
        int n=nums.length;
        int expectedSum=n*(n+1)/2;
        int actualSum=0;

        for(int num: nums) actualSum +=num;
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1}));
        }
    }
