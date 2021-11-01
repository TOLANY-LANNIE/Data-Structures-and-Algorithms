package Recursion;

/**
 * Write a description of class Fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fibonacci
{
    public static void main(String [] args){
        int n =1;
        System.out.println(fib(n));
    }


    /*this method gives you the next number of the sequence
     * depending on N which determines the count of the
     */
    public static int fib(int n){
        //base case
        if(n<=2) return n;

        return (fib(n-1)+fib(n-2));
    }
}
