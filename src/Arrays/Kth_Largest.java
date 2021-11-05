package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Kth_Largest {
    public static void main(String[] args) {
        int [] array = {1,2,8,9,5,6,7};
        int k=2; //end (k is the 6th largest)
        int x=4; //start (x is the 4th largest)
        findLargest(array,x,k ); //time complexity 0(N)
    }
   static void findLargest(int []array, int x, int k ){
        Arrays.sort(array);
        int len = k+x;
        for(int i =x ;i<=len;i++){
            System.out.println(array[array.length-i]);
        }
    }
}
