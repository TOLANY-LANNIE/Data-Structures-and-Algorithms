package DynamicProgramming;
/*
* Fibonacci using  DynamicProgramming (Memoization)
* Memoization stores instance solutions for reduce duplicates
* time complexity(n) ->Linear
* */

import java.util.HashMap;

public class Fibonacci {
    private static HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

    public static void main(String []args){
        int n = 4; // 4th position in the sequence
        System.out.println(fib(n));
    }

    public static int fib(int n){
        if(map.containsKey(n)) return map.get(n);

        if(n <=2) return 1; //base case
        int nthValue = fib(n - 1) + fib(n - 2);
        map.put(n, nthValue);
        return nthValue;
    }
}
