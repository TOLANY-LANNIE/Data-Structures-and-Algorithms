package DynamicProgramming;
/**
 * Write a description of class Fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MaxSubArray {
    public static void main(String [] args){
        int [] array = {-2,11,-4,13,-5,2};
        System.out.println(maxSubArray(array));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = maxSum;
        for(int i = 1; i < nums.length; i++){
            currentSum = Math.max(nums[i] + currentSum, nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;

    }
}
