
/**
 * Write a description of class Fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fibonacci
{
    public static void main(String [] args){
        int n1=0,n2 = 1;
        int n3 =0;
        int count = 5;
        System.out.print(n1+""+n2);//printing 0 and 1
        for(int i =2; i<count;++i){
            n3 = n2+ n1;
            System.out.print(n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
