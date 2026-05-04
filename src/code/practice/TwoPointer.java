package code.practice;

public class TwoPointer {
    public static int maxArea(int[] height){
        int left=0, right=height.length-1;
        int max=0;

        while (left < right){
            int area =Math.min(height[left], height[right]) * (right-left);
            max=Math.max(max, area);

            if(height[left] <= height[right]) left++;
            else right--;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{5,4,6,2,7}));
    }
}
