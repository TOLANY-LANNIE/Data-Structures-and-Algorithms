package DynamicProgramming;
/**
 * Write a description of class Fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MaxSubArray {
    public static void main(String [] args){
        int [] array = {3, 7, 4, 6, 5};
        System.out.println(maxSubArray(array));
    }

    //Note this is for contiguous some for  ints next to each other
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
