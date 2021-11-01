
/**
 * Write a description of class MinElement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MinElement{
    public static void main(String [] args){
        int [] array = {78,3,4,45,456,89,234,2,34,78,123,3,2,56783,1,0};
        int min = array[0];

        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }

        System.out.println("min element = "+min);
    }
}
