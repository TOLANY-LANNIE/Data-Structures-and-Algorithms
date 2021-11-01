
/**
 * Write a description of class Majority_Element here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Majority_Element
{
    public static void main(String [] args){
        int [] array = {2,2,1,1,1,2,2};
        System.out.println(majority(array));
    }

    public static int majority(int [] nums){
        int majority = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==majority){
                count+=1;
            }else{
                count-=1;
                if(count==0){
                    majority = nums[i];
                    count=1;
                }
            }
        }
        return  majority;
    }
}
