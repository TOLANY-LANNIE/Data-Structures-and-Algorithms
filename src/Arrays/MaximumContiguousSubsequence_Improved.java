package Arrays;

/**
 * Time complexity of N^2
 */
public class MaximumContiguousSubsequence_Improved
{
    public static void main(String [] args){
        int [] array = {-2,11,-4,13,-5,2};
        System.out.println(maxSubsequenceSum(array));
    }

    public static int maxSubsequenceSum( int [ ] a ) {
        int maxSum =0;
        for(int i=0; i<a.length;i++){
            int thisSum =0;
            for(int  j=i;j<a.length;j++){
                thisSum+=a[j];

                if(thisSum>maxSum){
                    maxSum = thisSum;
                    int seqStart = i;
                    int seqEnd = j;
                }
            }
        }
        return maxSum;
    }


    //method with time of N

    public int maxSubArrayN(int[] nums)
    {
        int maxSum = nums[0];
        int currentSum = maxSum;
        for(int i = 1; i < nums.length; i++){
            currentSum = Math.max(nums[i] + currentSum, nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

}
