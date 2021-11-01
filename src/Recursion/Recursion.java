package Recursion;


/**
 * Write a description of class Recursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recursion
{
    private static final String DIGIT_TABLE = "0123456789abcdef";

    public static void main(String [] args){

        Recursion r = new Recursion();
       /*//test cases
       System.out.println(r.factorial(1));
       System.out.println(r.factorial(2));
       System.out.println(r.factorial(3));
       System.out.println(r.factorial(4));
       System.out.println(r.factorial(5));*/

       /*System.out.println(r.sum(5));
       System.out.println(r.sum(10));
       System.out.println(r.sum(15));
       System.out.println(r.sum(20));
       System.out.println(r.sum(0));

       printDecimal(1996);*/
        int arr[] = {1, 5, 7, -2};
        int sum = r.calculateSum(arr, arr.length);

        System.out.println(sum);
    }

    public int factorial(int n){
        //check in n it equal to base case
        if(n==0)return 0;

        return n*factorial(n-1); //recursive case
        //Time complexity =O(n)
    }

    public int sum(int n){
        if(n==0)return 0;

        return (n + sum(n-1));
    }

    // Print n in base 10, recursively.
    // Precondition: n >= 0.
    public static void printDecimal( long n )
    {
        if( n >= 10 )
            printDecimal( n / 10 );
        System.out.println( (char) ('0' + ( n % 10 ) ) );
    }

    // Print n in any base, recursively.
    // Precondition: n >= 0, base is valid.
    public static void printInt( long n, int base )
    {
        if( n >= base )
            printInt( n / base, base );
        System.out.print( DIGIT_TABLE.charAt( (int) ( n % base ) ) );
    }


    //sum of array element using recursion
    public int calculateSum(int [] array,int n){
        if(n==0) return 0;

        //Calling method recursively
        return (calculateSum(array,n-1) + array[n-1]);
    }

}
